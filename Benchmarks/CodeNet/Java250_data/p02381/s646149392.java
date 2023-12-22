
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int[] s = new int[n];
			double e = 0.0, v = 0.0;
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				e += s[i];
				v += s[i] * s[i];
			}
			e /= n;
			v = v / n - e * e;
			System.out.println(Math.sqrt(v));
		}
	}
}

