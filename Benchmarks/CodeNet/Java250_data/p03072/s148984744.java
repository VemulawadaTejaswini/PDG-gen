import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int list[] = new int[n];
		for(int i=0; i<list.length; i++){
			list[i] = sc.nextInt();
		}

		int maxhigh = list[0];
		int count = 1;
		for(int j=1; j<list.length; j++){
			if(maxhigh <= list[j]){
				count++;
				maxhigh = list[j];
			}
		}

		System.out.println(count);
    }
}