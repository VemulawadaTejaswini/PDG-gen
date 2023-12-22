import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();

		int[] inA0 = new int[inN];
		inA0[0] = stdin.nextInt();
		for (int i = 1; i < inN; i++) {
			inA0[i] = inA0[i - 1] + stdin.nextInt();
		}

		int[] inA1 = new int[inN];
		for (int i = 0; i < inN; i++) {
			inA1[i] = stdin.nextInt();
		}

		int max = inA0[inN - 1] + inA1[inN - 1];
		for (int i = (inN - 2); i >= 0; i--) {
			inA1[i] += inA1[i + 1];
			max = Math.max(max, (inA0[i] + inA1[i]));
		}

		System.out.println(max);
	}

}
