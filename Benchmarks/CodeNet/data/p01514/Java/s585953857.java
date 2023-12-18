import java.util.*;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int team = stdIn.nextInt();  //チーム数
			int problem = stdIn.nextInt();//問題数
			int log = stdIn.nextInt(); //データセット数
			if(team + problem + log == 0) break;

			int[] correct = new int[team];
			int[] wrong = new int[team];
			long[][] penalty = new long[team][problem];

			for(int r = 0; r < log; r++) {
				int tId = stdIn.nextInt();
				int pId = stdIn.nextInt();
				int time = stdIn.nextInt();
				String judge = stdIn.next();

				if(judge.equals("CORRECT")) {
					correct[tId - 1]++;
					penalty[tId - 1][pId - 1] += time + (wrong[tId - 1] * 1200);
					wrong[tId - 1] = 0;
				} else {
					wrong[tId - 1]++;
				}
			}
			long[] Pscore = new long[team];
			for(int r = 0; r < penalty.length; r++) {
				for(int c = 0; c < penalty[r].length; c++) {
					Pscore[r] += penalty[r][c];
				}
			}
			
			Member[] mb = new Member[team];
			for(int r = 0; r < team; r++) {
				mb[r] = new Member(r + 1, correct[r], Pscore[r]);
			}
			Arrays.sort(mb);
			for(int r = 0; r < mb.length; r++) {
				System.out.println(mb[r].id + " " + mb[r].correct + " " + mb[r].penalty);
			}
		}
	}

	class Member implements Comparable<Member> {
		int id;
		int correct;
		long penalty;

		Member(int id, int correct, long penalty) {
			this.id = id;
			this.correct = correct;
			this.penalty = penalty;
		}

		public int compareTo(Member o) {
			if(this.correct < o.correct) {
				return(1);
			} else if(this.correct > o.correct) {
				return(-1);
			} else {//一致するとpenaltyの比較へ
				if(this.penalty > o.penalty) {
					return(1);
				} else if(this.penalty < o.penalty) {
					return(-1);
				} else {//一致するとidの比較へ
					if(this.id > o.id) {
						return(1);
					} else if(this.id < o.id) {
						return(-1);
					} else {
						return(0);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}