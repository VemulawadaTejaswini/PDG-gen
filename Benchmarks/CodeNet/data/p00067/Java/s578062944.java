import java.util.Scanner;

public class Main {
	public static int n[][];

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		n = new int[12][12];
		int cou = 0;
		for (int i = 0; i < 12; i++) {
			String text = stdIn.next();
			for (int j = 0; j < 12; j++) {
				n[i][j] = Integer.parseInt(String.valueOf(text.charAt(j)));
			}
		}
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (n[i][j] == 1) {
					cou++;
					Recursion(i, j);
				}
			}
		}
		System.out.println(cou);
	}

	public static void Recursion(int Longitudinal, int Beside) {
		if (Longitudinal < 0)
			return;
		if (Longitudinal > 11)
			return;
		if (Beside < 0)
			return;
		if (Beside > 11)
			return;
		if (n[Longitudinal][Beside] == 0)
			return;
		n[Longitudinal][Beside] = 0;
		Recursion(Longitudinal + 1, Beside);
		Recursion(Longitudinal - 1, Beside);
		Recursion(Longitudinal, Beside + 1);
		Recursion(Longitudinal, Beside - 1);
	}

}