
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[6];
		String W;

		for (int i = 0; i < dice.length; i++) {
			dice[i] = sc.nextInt();
		}

		W = sc.next();
		String[] w = W.split("");
		for (int i = 0; i < w.length; i++) {
			if (w[i].equals("S")) {
				int num = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = dice[0];
				dice[0] = num;
			} else if (w[i].equals("W")) {
				int num = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = dice[0];
				dice[0] = num;
			} else if (w[i].equals("N")) {
				int num = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = dice[0];
				dice[0] = num;

			} else if (w[i].equals("E")) {
				int num = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = dice[0];
				dice[0] = num;

			}
		}
		System.out.println(dice[0]);
		sc.close();
	}
}

