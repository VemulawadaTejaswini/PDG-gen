import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] card = new int[3][3];
		boolean[][] hit = new boolean[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				card[i][j] = sc.nextInt();
				hit[i][j] = false;
			}
		}

		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (list.contains(card[i][j])) {
					hit[i][j] = true;
				}
			}
		}
		boolean bingo = //
				(hit[0][0] && hit[0][1] && hit[0][2]) || //
						(hit[1][0] && hit[1][1] && hit[1][2]) || //
						(hit[2][0] && hit[2][1] && hit[2][2]) || //
						(hit[0][0] && hit[1][0] && hit[2][0]) || //
						(hit[0][1] && hit[1][1] && hit[2][1]) || //
						(hit[0][2] && hit[1][2] && hit[2][2]) || //
						(hit[0][0] && hit[1][1] && hit[2][2]) || //
						(hit[0][2] && hit[1][1] && hit[2][0]);
		if (bingo) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
