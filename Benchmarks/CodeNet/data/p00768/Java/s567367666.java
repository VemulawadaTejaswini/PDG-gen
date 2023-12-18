import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int allMinutes = nextInt();
			if (allMinutes == 0) {
				break;
			}
			int teamNum = nextInt();
			int problemNum = nextInt();
			int submitNum = nextInt();

			Team[] teams = new Team[teamNum];
			for (int i = 0; i < teams.length; i++) {
				teams[i] = new Team(i + 1);
				teams[i].penalty = new int[problemNum];
			}

			for (int i = 0; i < submitNum; i++) {
				int time = nextInt();
				int team = nextInt();
				int problem = nextInt();
				int judge = nextInt();

				if (judge == 0) {
					teams[team - 1].correct++;
					teams[team - 1].minutes += time;
					teams[team - 1].minutes += teams[team - 1].penalty[problem - 1];
				} else {
					teams[team - 1].penalty[problem - 1] += 20;
				}
			}
			Arrays.sort(teams);

			for (int i = 0; i < teams.length; i++) {
				if (i != 0) {
					if (teams[i - 1].correct == teams[i].correct
							&& teams[i - 1].minutes == teams[i].minutes) {
						System.out.print("=");
					} else {
						System.out.print(",");
					}
				}
				System.out.print(teams[i].id);
			}
			System.out.print("\n");
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
	int id = 0, minutes = 0, correct = 0, realPenalty = 0;
	int[] penalty;

	Team(int id) {
		this.id = id;
	}

	public int compareTo(Team team) {
		if (team.correct == this.correct) {
			if (this.minutes == team.minutes) {
				return team.id - this.id;// 降順
			} else {
				return this.minutes - team.minutes;// 昇順
			}
		} else {
			return team.correct - this.correct;// 降順
		}
	}
}