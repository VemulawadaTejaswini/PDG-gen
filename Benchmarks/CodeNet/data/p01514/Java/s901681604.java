import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();

			if(t==0&&p==0&&r==0)break;
			
			Team[] team = new Team[t];
			for (int i = 0; i < t; i++)
				team[i] = new Team(i, p);

			for (int i = 0; i < r; i++) {
				int tid = sc.nextInt() - 1;
				int pid = sc.nextInt() - 1;
				int time = sc.nextInt();
				String message = sc.next();

				if (message.equals("CORRECT")) {
					team[tid].correct++;
					int tasu=team[tid].problem[pid] * 1200 + time;
					team[tid].point +=tasu; 
				} else
					team[tid].problem[pid]++;

			}
			
			Arrays.sort(team,new Com());
			
			for(int i=team.length-1;i>=0;i--){
				int reteam=team[i].tid+1;
			//	for(int j=0;j<p;j++)System.out.println(team[i].problem[j]);
				System.out.println(reteam+" "+team[i].correct+" "+team[i].point);
			}
			
			
		}

	}

}

class Team {
	int tid;
	int point;
	int correct;
	int[] problem;

	public Team(int num, int array) {
		tid = num;
		point = 0;
		correct = 0;
		problem = new int[array];
	}
}

class Com implements Comparator<Team> {
	public int compare(Team t1, Team t2) {
		if (t1.correct != t2.correct)
			return t1.correct - t2.correct;
		else if (t2.point != t1.point)
			return t2.point - t1.point;
		else
			return t2.tid - t1.tid;
	}
}