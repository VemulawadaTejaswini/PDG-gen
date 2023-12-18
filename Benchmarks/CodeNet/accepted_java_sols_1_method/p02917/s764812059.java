
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int b1=100000,  b2=0;

		int[] b = new int[n];

		for(int i=1;i<n;i++) {
			b[i] = sc.nextInt();
		}

		b[0] = b[1];
		ans += b[n-1];
		for(int i=1;i<n;i++) {
			ans += Math.min(b[i], b[i-1]);
		}

		System.out.println(ans);
	}
}
