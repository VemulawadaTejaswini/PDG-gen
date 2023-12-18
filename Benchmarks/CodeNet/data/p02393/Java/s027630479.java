import java.util.*;

public class Main {
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] data = str.split(" ");
	int[] num = new int[data.length];
	
	for(int i = 0; i < data.length; i ++)
		num[i] = Integer.parseInt(data[i]);

	for(int i = 0; i < num.length -1; i++){
		for(int j = 0; j < num.length - 1; j++){
			if(num[j] > num[j+1]){
				int tmp = num[j+1];
				num[j+1] = num[j];
				num[j] = tmp;
			}
		}
	}

	for(int i = 0; i < num.length; i++){
		System.out.print(num[i] + " ");
	}
    }
 
}
