import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int p = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);

		q /= gcd(p, q);

		int ans = 1;
		for (int i = 2; i <= Math.sqrt(q); i++) {
			if (q % i == 0) {
				while (q % i == 0) {
					q /= i;
				}
				ans *= i;
			}
		}
		ans *= q;
		System.out.println(ans);
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
