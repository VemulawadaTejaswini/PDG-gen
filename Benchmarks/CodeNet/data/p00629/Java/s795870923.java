import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	
	static class Team implements Comparable<Team>{
		int id, u, a, p;
		
		Team(int id, int u, int a, int p) {
			this.id = id;
			this.u = u;
			this.a = a;
			this.p = p;
		}

		public int compareTo(Team o) {
			if (this.a != o.a) {
				return o.a - this.a;
			} else if (this.p != o.p) {
				return this.p - o.p;
			} else {
				return this.id - o.id;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Team t[];
		int uni[];
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			t = new Team[n];
			for (int i = 0; i < n; i++) {
				t[i] = new Team(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			
			Arrays.sort(t);
			int cnt = 0;
			uni = new int[1005];
			for (int i = 0; i < n; i++) {
				if (cnt < 10) {
					if (uni[t[i].u] < 3) {
						System.out.println(t[i].id);
						cnt++;
						uni[t[i].u]++;
					}
				} else if (cnt < 20) {
					if (uni[t[i].u] < 2) {
						System.out.println(t[i].id);
						cnt++;
						uni[t[i].u]++;
					}
				} else if (cnt < 26) {
					if (uni[t[i].u] == 0) {
						System.out.println(t[i].id);
						cnt++;
						uni[t[i].u]++;
					}
				}
			}
		}
	}
}