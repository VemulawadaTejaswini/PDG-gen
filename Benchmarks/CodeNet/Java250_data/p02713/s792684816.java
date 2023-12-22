import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		int total = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				for (int k = 1; k <= num; k++) {
					total += calc3GCD(i, j, k);
				}
			}
		}
		System.out.println(total);
	}

	public static int calc3GCD(int a, int b, int c) {
		int tempGCD = calcGCD(a, b);

		return calcGCD(tempGCD, c);
	}

	public static int calcGCD(int a, int b) {
		int[] numArray = { a, b };
		Arrays.sort(numArray);
		int x;
		int y;
		x = numArray[1];
		y = numArray[0];

		int tmp;
		while ((tmp = x % y) != 0) {
			x = y;
			y = tmp;
		}
		return y;
	}
}
