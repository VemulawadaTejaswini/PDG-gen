
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] number =	new int[n];
		long ans = 1;
		for(int i=0;i<n;i++){
			number[i] = stdIn.nextInt();
		}
		
		for(int i=2;i<=1000;i++){
			int max=0;
			for(int j=0;j<n;j++){
				int count=0;
				while(number[j]%i==0){
					count++;
					number[j] =number[j]/i;
				}
				if(count>max){
					max = count;
				}
			}
			for(int j=1;j<=max;j++){
				ans = ans * i;
			}
		}
		
		System.out.println(ans);
	}

}