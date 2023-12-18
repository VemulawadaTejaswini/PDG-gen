import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] T = new int[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
		}
		int[] A = new int[M];
		int[] B = new int[M];
		int[] D = new int[M];
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
			D[i] = sc.nextInt();
		}
		V[] v = new V[N];
		for(int i = 0; i < N; i++) {
			v[i] = new V();
		}
		for(int i = 0; i < M; i++) {
				v[A[i]].n_V.add(B[i]);
				v[A[i]].n_T.add(D[i]);
				v[B[i]].n_V.add(A[i]);
				v[B[i]].n_T.add(D[i]);
		}
		int INF = 2 << 29;
		
		
		int[][][] memo = new int[3][201][N];
		for(int i = 0; i < memo.length; i++) {
			for(int j = 0; j < 201; j++) {
				Arrays.fill(memo[i][j], INF);
			}
			
		}
		
		
		
		PriorityQueue<Data> q = new PriorityQueue<Data>();
		q.add(new Data(0,0,0,X,-10000));
		int ans = INF;
		while(!q.isEmpty()) {
			Data d = q.poll();
			if(d.now == N-1) {
				ans = Math.min(ans, d.time);
				continue;
			}
			V vv = v[d.now];
			ArrayList<Integer> vn = vv.n_V;
			ArrayList<Integer> vt = vv.n_T;
			
			if(d.state == 0) {
				if(memo[0][d.c_t][d.now] <= d.time) continue;
				memo[0][d.c_t][d.now] = d.time;
				for(int i = 0; i < vn.size(); i++) {
					int next_v = vn.get(i);
					int next_t = vt.get(i);
					int cend = d.c_t;
					if(next_t >= cend) {
						if(T[next_v] == 0) {
							q.add(new Data(d.time + next_t,next_v,0,X,0));
						} else if(T[next_v] == 1) {
							q.add(new Data(d.time + next_t,next_v,1,0,0));
						} else {
							q.add(new Data(d.time + next_t,next_v,2,0,X));
						}
					} else {
						if(T[next_v] == 0) {
							q.add(new Data(d.time + next_t,next_v,0,X,0));
						} else if(T[next_v] == 1) {
							q.add(new Data(d.time + next_t,next_v,0,cend - next_t,0));
						} else {
							continue;
						}
					}
				}
			} else if(d.state == 1) {
				if(memo[1][0][d.now] <= d.time) continue;
				memo[1][0][d.now] = d.time;
				for(int i = 0; i < vn.size(); i++) {
					int next_v = vn.get(i);
					int next_t = vt.get(i);
					if(T[next_v] == 0) {
						q.add(new Data(d.time + next_t,next_v,0,X,0));
					} else if(T[next_v] == 1) {
						q.add(new Data(d.time + next_t,next_v,1,0,0));
					} else {
						q.add(new Data(d.time + next_t,next_v,2,0,X));
					}
				}
				
				
			} else {
				if(memo[2][d.h_t][d.now] <= d.time) continue;
				memo[2][d.h_t][d.now] = d.time;
				for(int i = 0; i < vn.size(); i++) {
					int next_v = vn.get(i);
					int next_t = vt.get(i);
					int cend = d.h_t;
					if(next_t >= cend) {
						if(T[next_v] == 0) {
							q.add(new Data(d.time + next_t,next_v,0,X,0));
						} else if(T[next_v] == 1) {
							q.add(new Data(d.time + next_t,next_v,1,0,0));
						} else {
							q.add(new Data(d.time + next_t,next_v,2,0,X));
						}
					} else {
						if(T[next_v] == 0) {
							continue;
						} else if(T[next_v] == 1) {
							q.add(new Data(d.time + next_t,next_v,2,0,cend - next_t));
						} else {
							q.add(new Data(d.time + next_t,next_v,2,0,X));
						}
					}
				}
			}
			
		}
		System.out.println(ans);
		
	}
	static class V {
		ArrayList<Integer> n_V = new ArrayList<Integer>();
		ArrayList<Integer> n_T = new ArrayList<Integer>();
	}
	
	static class Data implements Comparable<Data> {
		
		int time;
		int now;
		int state;
		int c_t;
		int h_t;
		
		Data(int a, int b, int c, int d, int e) {
			time = a;
			now = b;
			state = c;
			c_t = d;
			h_t = e;
		}
		

		@Override
		public int compareTo(Data o) {
			return this.time - o.time;
		}
		
	}
}