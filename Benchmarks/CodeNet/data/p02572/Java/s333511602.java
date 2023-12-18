import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] data = new int[n];
		for(int i = 0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		
		long[] sum = new long[n];
		sum[n-1] = data[n-1];
		for(int i = n-2; i>=0 ;i--) {
			sum[i] = data[i]+sum[i+1];
		}
		
		long out = 0;
		for(int i = 0; i<n-1; i++) {
			out += (data[i] * sum[i+1])% 1000000007;
			out %= 1000000007;
		}
		
		System.out.println(out);
	}
}
