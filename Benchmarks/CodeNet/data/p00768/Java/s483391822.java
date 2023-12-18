import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Team implements Comparable<Team> {
		int team_num;
		int ac_num;
		int time;
		
		boolean[] ac_ed;
		int[] penalty;

		public Team(int team_num, int ac_num, int time, boolean[] ac_ed, int[] penalty) {
			super();
			this.team_num = team_num;
			this.ac_num = ac_num;
			this.ac_ed = ac_ed;
			this.penalty = penalty;
			this.time = time;
		}
		
		void answer(int number, int time){
			if(ac_ed[number]){
				return;
			}
			ac_ed[number] = true;
			ac_num++;
			this.time += time + penalty[number] * 20;
			penalty[number] = 0;
		}
		
		void wrong(int number){
			if(ac_ed[number]){
				return;
			}
			penalty[number]++;
		}

		@Override
		public int compareTo(Team o) {
			if (this.ac_num > o.ac_num) {
				return -1;
			} else if (this.ac_num < o.ac_num) {
				return 1;
			} else if (this.time < o.time) {
				return -1;
			} else if (this.time > o.time) {
				return 1;
			} else {
				return o.team_num - this.team_num;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int M = sc.nextInt();
			final int T = sc.nextInt();
			final int P = sc.nextInt();
			final int R = sc.nextInt();

			if(M == 0 && T == 0 && P == 0 && R == 0){
				break;
			}
			
			Team[] team = new Team[T];
			for(int i = 0; i < T; i++){
				team[i] = new Team(i + 1, 0, 0, new boolean[P], new int[P]);
			}
			
			for (int count = 0; count < R; count++) {
				final int m = sc.nextInt();
				final int t = sc.nextInt();
				final int p = sc.nextInt();
				final int j = sc.nextInt();
				
				boolean ac = j == 0;
				if(ac){
					team[t - 1].answer(p - 1, m);
				}else{
					team[t - 1].wrong(p - 1);
				}
			}
			
			Arrays.sort(team);
			
			for(int i = 0; i < T; i++){
				System.out.print(team[i].team_num/* + "(" + team[i].ac_num + ")"*/);
				
				if(i != T - 1 && team[i+1].ac_num == team[i].ac_num && team[i+1].time == team[i].time){
					System.out.print("=");
				}else if(i != T - 1){
					System.out.print(",");
				}
			}
			
			System.out.println();
		}
	}
}