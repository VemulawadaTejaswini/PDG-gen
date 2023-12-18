import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		int[] b = new int[10];
		for (int i = 0; i < 10; i++) {
			b[i] = s.nextInt();
		}
		Arrays.sort(b);
		for (int i = 9; i >= 7; i--) {
			System.out.println(b[i]);
		}
	}
}