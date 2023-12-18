import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		List<Long> b = new ArrayList<>();
		long base = 1;
		while (true) {
			base *= 26;
			b.add(base);
			if (base > 1000000000000001L) {
				break;
			}
		}

		int a = 0;
		for (int i = 0; i < b.size(); i++) {
			if (n <= b.get(i)) {
				a = i + 1;
				break;
			}
			n -= b.get(i);
		}

		int[] c = new int[a];
		int i = 0;
		n--;
		while (n > 0) {
			c[i] = (int) (n % 26);
			n /= 26;
			i++;
		}

		for (i = a - 1; i >= 0; i--) {
			char d = (char) ('a' + c[i]);
			System.out.print(d);
		}
		System.out.println();
	}
}
