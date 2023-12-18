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

		long ans = 0L;
		for(int i=0;i<n-1;i++) {
			long ai = array[i];
			long tmp=0L;
			for(int j=i+1;j<n;j++) {
				tmp=tmp+array[j];
				tmp = tmp%mod;
			}
			ans = (ai*tmp%mod + ans)%mod;
		}

		System.out.println(ans);
	}
}
