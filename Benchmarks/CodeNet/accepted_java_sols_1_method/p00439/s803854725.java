import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] ans = new int[1000];
		int index = 0;
		
		while( n != 0 || k != 0 ){
			int sum = 0;
			int[] num = new int[n];
			for(int i = 0; i < k; i++){
				num[i] = stdIn.nextInt();
				sum += num[i];
			}
			for(int i = k; i < n; i++){
				num[i] = stdIn.nextInt();
			}
		
			int max = sum;
			for(int i = 0; i < n-k; i++){
				sum = sum-num[i]+num[i+k];
				if( sum > max ){
					max = sum;
				}
				
			}
			ans[index] = max;
			index++;
			n = stdIn.nextInt();
			k = stdIn.nextInt();
		}
		for(int i = 0; i < index; i++){
			System.out.println(ans[i]);
		}
	}
}