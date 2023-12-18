import java.util.Scanner;

public class Main {

	private static long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();


		long ans = 1L;
		for(int i=1;i<=n;i++) {
			ans = ans * 10L%MOD;
		}

		long bb = 1L;
		for(int i=1;i<=n;i++) {
			bb = bb * 9L%MOD;
		}

		long cc = 1L;
		for(int i=1;i<=n;i++) {
			cc = cc * 8L%MOD;
		}

		ans = (ans - bb)%MOD;
		ans = (ans -bb)%MOD;
		ans = (ans +cc)%MOD;
		if(ans<0) {
			ans=ans+MOD;
		}
		System.out.println(ans);
	}
}
