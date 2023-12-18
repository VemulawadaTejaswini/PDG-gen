import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int N, M, R, Q;
	static Range2[] qs;
	static ArrayList<Range>[][] rs;
	static boolean read() {
		N = sc.nextInt(); M = sc.nextInt();
		if (N == 0 && M == 0) return false;
		
		rs = new ArrayList[N + 1][M + 1]; // PC Student  
		for (int i = 0; i < N + 1; i++) {
			rs[i] = new ArrayList[M + 1];
			for (int j = 0; j < M + 1; j++) {
				rs[i][j] = new ArrayList<Range>();
			}
		}
				
		R = sc.nextInt();
		for (int i = 0; i < R; i++) {
			int t, n, m, s;
			t = sc.nextInt();
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			if (s == 1) {
				rs[n][m].add(new Range(t, -1));
				
			} else {
				for (int j = 0; j < rs[n][m].size(); j++) {
					if (rs[n][m].get(j).end == -1) {
						rs[n][m].get(j).end = t;
						break;
					}
				}
			}
		}
		
		Q = sc.nextInt();
		qs = new Range2[Q];
		for (int i = 0; i < Q; i++) 
			qs[i] = new Range2(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		return true;
	}

	static void solve() {
		for (int i = 0; i < Q; i++) {
			int ans = 0;
			for (int t = qs[i].start; t < qs[i].end; t++) {
				boolean add = false;
				for (int j = 1; j <= N && !add; j++) {
					for (int k = 0; k < rs[j][qs[i].student].size() && !add; k++) {
						if (rs[j][qs[i].student].get(k).start <= t && t < rs[j][qs[i].student].get(k).end) {
							ans++;
							add = true;
						}
					}
				}
			}	
			System.out.println(ans);
		}
	}	
}

class Range {
	int start, end;
	Range(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

class Range2 {
	int start, end, student;
	Range2(int start, int end, int student) {
		this.start = start;
		this.end = end;
		this.student = student;
	}
}