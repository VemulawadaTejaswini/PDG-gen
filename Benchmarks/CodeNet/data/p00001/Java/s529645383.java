import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int[] mountainHigh = new int[10];
		for (int i = 0; i < 10; i++) {
			mountainHigh[i] = sc.nextInt();
		}
		Arrays.sort(mountainHigh);
		for (int i = 9; i > 9 - 3; i --) {
			System.out.println(mountainHigh[i]);
		}
	}
}