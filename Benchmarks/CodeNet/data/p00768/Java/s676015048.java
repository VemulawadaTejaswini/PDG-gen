import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Team[] list;
		while(true) {
			int M = stdIn.nextInt();
			int T = stdIn.nextInt();
			int P = stdIn.nextInt();
			int R = stdIn.nextInt();
			if(M == 0 && T == 0 && P == 0 && R == 0) break;
			list = new Team[T];
			for(int i = 0; i < T; i++) {
				list[i] = new Team(i+1,P);
			}
			
			for(int i = 0; i < R; i++) {
				int m = stdIn.nextInt();
				int t = stdIn.nextInt();
				int p = stdIn.nextInt();
				int j = stdIn.nextInt();
				
				if(j == 0) {
					list[t-1].correct++;
					list[t-1].time += m + list[t-1].wrong[p-1]*20;
				}
				else {
					list[t-1].wrong[p-1]++;
				}
			}
			Arrays.sort(list, new MyComp());
			System.out.print(list[0].id);
			for(int i = 1; i < T; i++) {
				if(list[i-1].correct == list[i].correct && list[i-1].time == list[i].time) {
					System.out.print("="+list[i].id);
				}
				else {
					System.out.print(","+list[i].id);
				}
			}
			System.out.println();
		}
	}
	
}

class Team {
	int id;
	int[] wrong;
	int correct;
	int time;
	public Team(int id, int r) {
		this.id = id;
		wrong = new int[r+1];
		correct = 0;
		time = 0;
	}
}

class MyComp implements Comparator<Team> {

	public int compare(Team o1, Team o2) {
		if(o1.correct < o2.correct) {
			return 1;
		}
		else if(o1.correct > o2.correct) {
			return -1;
		}
		else if(o1.time < o2.time) {
			return -1;
		}
		else if(o1.time > o2.time) {
			return 1;
		}
		else if(o1.id < o2.id) {
			return 1;
		}
		else if(o1.id > o2.id) {
			return -1;
		}
		return 0;
	}
	
}