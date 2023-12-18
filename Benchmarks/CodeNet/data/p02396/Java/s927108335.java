import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] data = new int[10001];
		int bu = 0;
		int i = 1;
		while(bu == 0){
			data[i] = sc.nextInt();
			if(data[i] == 0){
				bu = 1;
			}
			i++;
		}
		int j ;
		for(j = 1; j<=i; j++){
			if(data[j] != 0){
				System.out.println("case "+j+": "+data[j]);
			}
		}
	}
}