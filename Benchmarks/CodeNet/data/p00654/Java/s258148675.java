import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int gcd(int a, int b) {
		if (a < b) {
			a ^= b;
			b ^= a;
			a ^= b;
		}
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int b[];
		int ini;
		int even[];
		int eid;
		int a[];
		int aid;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			even = new int[n];
			eid = 0;
			b = new int[n * (n + 1) / 2];
			a = new int[n];
			aid = 0;
			for (int i = 0; i < b.length; i++) {
				b[i] = sc.nextInt();
				if (b[i] % 2 == 0) {
					even[eid++] = b[i];
				}
			}
			
			ini = gcd(even[0], even[1]);
			for (int i = 2; i < n; i++) {
				ini = gcd(ini, even[i]);
			}
			for (int i = 0; i < n; i++) {
				a[i] = even[i] / ini;
			}
			Arrays.sort(a);
			System.out.println(ini);
			String s = "";
			for (int i = 0; i < n; i++) {
				System.out.print(s + a[i]);
				s = " ";
			}
			System.out.println();
		}
	}
}