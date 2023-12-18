
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			long[] num = new long[6];
			boolean flag = true;
			for (int i = 0; i < 6; i++) {
				num[i] = scanner.nextLong();
				if (num[i] != 0)
					flag = false;
			}
			if (flag)
				break;
			long[] a = new long[3];
			for (int i = 0; i < 3; i++) {
				a[i] = getA(num[i * 2], num[i * 2 + 1]);
			}
			long b = a[0] / getGCD(a[0], a[1]) * a[1];
			long c = b / getGCD(b, a[2]) * a[2];
			System.out.println(c);
		}
	}

	public static long getGCD(long a, long b) {
		long tmp;
		while (b != 0) {
			tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}

	private static long getA(long l, long m) {
		long count = 1;
		long b = 1;
		while (true) {
			b = b * l % m;
			if (b == 1) {
				break;
			}
			count++;
		}
		return count;
	}
}