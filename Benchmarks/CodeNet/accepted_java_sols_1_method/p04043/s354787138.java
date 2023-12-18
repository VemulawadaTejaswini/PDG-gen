import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();

			int[] a = new int[] { A, B, C, };
			Arrays.sort(a);

			if (a[0] == 5 && a[1] == 5 && a[2] == 7) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
