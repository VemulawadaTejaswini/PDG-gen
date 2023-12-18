import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N;
	private int R;
	private int L;

	private int topteam = 0;
	private int lasttime = 0;


	private int team[][];//0:得点、1:時間

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		R = scan.nextInt();
		L = scan.nextInt();

		team = new int[N][2];

		for(int i = 0; i < N ;i++) {
			Arrays.fill(team[i],0);
		}


		for(int i = 0;i < R ; i++) {
			looprun();
		}

		team[topteam][1] += L - lasttime;

		//Arrays.asList(team).stream().forEach(e -> System.out.println("score: " + e[0] + ",time: " + e[1] ));

		System.out.println(timeTopteam() + 1);

	}

	private void looprun() {
		int d = scan.nextInt();
		int t = scan.nextInt();
		int x = scan.nextInt();

		team[topteam][1] += t - lasttime;
		team[d - 1][0] += x;

		topteam = scoreTopteam(d - 1,x);
		lasttime = t;
	}

	private int timeTopteam() {
		int ansS = team[0][1];
		int ansT = 0;
		for(int i = 0;i < N;i++) {
			if(ansS < team[i][1]) {
				ansS = team[i][1];
				ansT = i;
			}
		}

		return ansT;
	}

	private int scoreTopteam(int addId ,int addX) {

		int ansT = topteam;

		if(addX > 0) {
			if(addId != topteam && (team[topteam][0] < team[addId][0] || (team[topteam][0] == team[addId][0] && addId < topteam ))) {
				ansT = addId;
			}
		}else {
			if(topteam == addId) {
				int ansS = team[0][0];
				ansT = 0;
				for(int i = 0;i < N;i++) {
					if(ansS < team[i][0]) {
						ansS = team[i][0];
						ansT = i;
					}
				}
			}
		}

		return ansT;
	}
}

