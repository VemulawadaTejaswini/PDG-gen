import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long judge = (long) Math.pow(10, 18);
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		if(a[0]==0) {
			System.out.println(0);
			return;
		}
		long ans = 1;
		for(int i = 0; i < n; i++) {
			if(ans>judge/a[i]) {
				System.out.println(-1);
				return;
			}
			ans*=a[i];
		}
		System.out.println(ans);
	}
}