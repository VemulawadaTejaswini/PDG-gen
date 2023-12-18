import java.util.Scanner;


public class Main {
	static boolean[] isDist;
	static int N;
	static int M;
	public static int INF = 1 << 24;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		N = stdIn.nextInt();
		M = stdIn.nextInt();
		int p = stdIn.nextInt();
		isDist = new boolean[N];
		for(int i = 0; i < M ;i++) {
			int d = stdIn.nextInt();
			isDist[d] = true;
		}
		int ans = Math.min(solv(1,p,0,0,false), solv(-1,p,0,0,false));
		System.out.println(ans-100);
		
		
	}
	
	public static int solv(int vec, int nowp, int count, int cost, boolean alC) {
		if(count == M) return cost;
		if(nowp == N) {
			nowp = 0;
		}
		if(nowp == -1) {
			nowp = N-1;
		}
		if(isDist[nowp]) {
			count++;
			int ret = solv(vec,nowp+vec,count,cost+100,alC);
			if(!alC) {
				int ret2 = solv(vec*-1,nowp+vec*-1,count,cost+100,true);
				if(ret > ret2) {
					ret = ret2;
				}
			}
			return ret;
		}
		else {
			return solv(vec,nowp+vec,count,cost+100,alC);
		}
	}
}

  