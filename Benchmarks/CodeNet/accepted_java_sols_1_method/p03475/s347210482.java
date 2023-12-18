import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int[] inC = new int[inN - 1];
		int[] inS = new int[inN - 1];
		int[] inF = new int[inN - 1];

		for (int i = 0; i < (inN - 1); i++) {
			inC[i] = stdin.nextInt();
			inS[i] = stdin.nextInt();
			inF[i] = stdin.nextInt();
		}

		for (int i = 0; i < inN; i++) {
			int station = i;
			int time = 0;
			while (station < (inN - 1)) {
				if (time <= inS[station]) {
					time = inS[station];
				}
				else {
					int t;
					for (t = inS[station]; t < time; t += inF[station]) {}
					time = t;
				}

				time += inC[station];
				station++;
			}

			System.out.println(time);
		}
	}

}
