import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int T = scanner.nextInt();
			if (T == 0) {
				break;
			}
			int P = scanner.nextInt();
			int R = scanner.nextInt();

			Team[] teams = new Team[T];
			for (int i = 0; i < teams.length; i++) {
				teams[i] = new Team(i);
			}

			int[][] wrong = new int[T][P];
			for (int i = 0; i < R; i++) {
				int tID = scanner.nextInt();
				int pID = scanner.nextInt();
				int time = scanner.nextInt();
				String message = scanner.next();
				if (message.equals("WRONG")) {
					wrong[tID - 1][pID - 1]++;
				} else {
					teams[tID - 1].correct++;
					teams[tID - 1].penalty += time + wrong[tID - 1][pID - 1]
							* 1200;
				}
			}
			Arrays.sort(teams);
			for (int i = 0; i < teams.length; i++) {
				System.out.println((teams[i].tID + 1) + " " + teams[i].correct
						+ " " + teams[i].penalty);
			}

		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}

class Team implements Comparable<Team> {
	int tID, correct = 0, penalty = 0;

	Team(int id) {
		this.tID = id;
	}

	@Override
	public int compareTo(Team arg0) {
		if (arg0.correct == this.correct) {
			if (arg0.penalty == this.penalty) {
				return this.tID - arg0.tID;
			}
			return this.penalty - arg0.penalty;
		}
		return arg0.correct - this.correct;
	}
}