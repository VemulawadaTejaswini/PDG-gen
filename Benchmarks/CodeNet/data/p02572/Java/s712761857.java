import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextLong();
		}
		sc.close();

		long mod = 1000000000L+7L;

		long sum = 0L;
		for(int i=0;i<n;i++) {
			sum=sum+array[i];
			sum = sum%mod;
		}

		long ans = 0L;
		for(int i=0;i<n-1;i++) {
			long ai = array[i];
			sum = sum-ai;
			if(sum<0L) {
				sum=sum+mod;
			}
			ans = (ai*sum%mod + ans)%mod;
		}

		System.out.println(ans);
	}
}
