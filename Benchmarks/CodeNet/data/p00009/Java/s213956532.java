import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static final int MAX = 999999;
	static int[] p = new int[MAX + 1];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Arrays.fill(p, 0);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int cnt = 0;
			for(int i = 2; i <= n; i++) {
				if(isPrime(i)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

	private static boolean isPrime(int i) {
		if(p[i] == 0) {
			double root = Math.sqrt(i);
			for(int j = 2; j <= root; j++) {
				if(i % j == 0) {
					p[i] = 2;
					return false;
				}
			}
			p[i] = 1;
			return true;
		}
		if (p[i] == 1) {
			return true;
		}
		return false;
	}


}

