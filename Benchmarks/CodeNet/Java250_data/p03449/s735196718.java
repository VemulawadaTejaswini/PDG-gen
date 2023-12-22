import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int[] ameUe = new int[N];
		int[] ameShita = new int[N];
		for (int i = 0; i < N; i++) {
			int a1i = sc.nextInt();
			if (i > 0) {
				ameUe[i] = ameUe[i - 1] + a1i;
			} else {
				ameUe[i] = a1i;
			}
		}

		for (int i = 0; i < N; i++) {
			int a2i = sc.nextInt();
			if (i > 0) {
				ameShita[i] = ameShita[i - 1] + a2i;
			} else {
				ameShita[i] = a2i;
			}
		}

		int maxAme = 0;
		for (int i = 0; i < N; i++) {
			int ame;
			if (i == 0) {
				ame = ameUe[0] + ameShita[N - 1];
			} else {
				ame = ameUe[i] + ameShita[N - 1] - ameShita[i - 1];
			}
			maxAme = Math.max(maxAme, ame);
		}

		System.out.println(maxAme);
		sc.close();
	}

}