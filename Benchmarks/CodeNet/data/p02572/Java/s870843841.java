import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a[] = new int[n];
		final int MOD = 1000000007;
		long tmp = 0;
		for(int i = 0 ; i < n ; i++){
			a[i] = Integer.parseInt(sc.next());
			tmp += a[i];
			tmp %= MOD;
		}
		sc.close();
		long sum = 0;
		for(int i = 0 ; i < n; i++){
			tmp -= a[i];
			sum += (a[i] * tmp);
			sum %= MOD;
		}
		System.out.println(sum);
	}
}