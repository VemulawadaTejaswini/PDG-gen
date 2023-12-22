import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] bitCount = new int[60];
		long a;
		for (int i = 0; i < n; i++) {
			a = scanner.nextLong();
			for (int j = 0; a > 0; j++, a >>= 1) {
				if (a % 2 == 1)
					bitCount[j]++;
			}
		}
		long sum = 0, num, bit;
		for (int i = 0; i < 60; i++) {
			num = (long) bitCount[i] * (n - bitCount[i]);
			num %= 1000000007;
			bit = 1l << i;
			bit %= 1000000007;
			sum += num * bit;
			sum %= 1000000007;
		}
		System.out.println(sum);
	}

}
