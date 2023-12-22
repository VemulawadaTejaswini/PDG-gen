import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inH = stdin.nextInt();
		int inW = stdin.nextInt();
		int max = inH * inW;

		int inD = stdin.nextInt();

		int[] ah = new int[max];
		int[] aw = new int[max];
		for (int h = 1; h <= inH; h++) {
			for (int w = 1; w <= inW; w++) {
				int inA = stdin.nextInt();
				ah[inA - 1] = h;
				aw[inA - 1] = w;
			}
		}

		int[] pow = new int[max];
		for (int a = inD; a < max; a++) {
			pow[a] = pow[a - inD] + Math.abs(ah[a] - ah[a - inD]) + Math.abs(aw[a] - aw[a - inD]);
		}

		int inQ = stdin.nextInt();
		for (int i = 0; i < inQ; i++) {
			int inL = stdin.nextInt();
			int inR = stdin.nextInt();

			System.out.println(pow[inR - 1] - pow[inL - 1]);
		}
	}
}
