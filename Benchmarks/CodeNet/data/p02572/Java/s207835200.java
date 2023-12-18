import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] arr = new long[n];
		long sum = 0;
		long ans = 0;
		long mod = 1000000007;
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextLong();
			sum+=arr[i]%mod;
		}
		scan.close();

		for(int i=0;i<n;i++) {
			sum -= arr[i];
			ans += arr[i] * sum;
			ans = ans%mod;
		}

		System.out.println(ans);

	}

}
