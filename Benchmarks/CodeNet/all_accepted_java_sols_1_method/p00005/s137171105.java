import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> ret = new ArrayList<String>();
		while (sc.hasNext()) {
			long A = sc.nextLong();
			long B = sc.nextLong();

			long a = A;
			long b = B;
			int i;
			long G = 1; // ?????§??¬?´???°
			boolean flg;
			do {
				flg = false;
				long max = (a >= b) ? a : b;
				for (i = 2; i < max; i++) {
					if (a % i == 0 && b % i == 0) {
						a = a / i;
						b = b / i;
						G = G * i;
						flg = true;
						break;
					}
				}
			} while (flg);
			long L = A * B / G;
			ret.add(G + " " + L);
		}
		for (String ans : ret) {
			System.out.println(ans);
		}
	}
}