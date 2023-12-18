import java.util.Scanner;

public class Main{
	public static int p, q, a, n;
	public static double pq;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			p = in.nextInt();
			q = in.nextInt();
			a = in.nextInt();
			n = in.nextInt();
			if(n == 0) return;
			count = 0;
			pq = (double)p/q;
			dfs(0, 1, 0, 1);
			System.out.println(count);
		}
	}
	
	public static final double EPS = 1e-8;
	public static int count;
	// depth <= n
	// denom <= a
	// num/denom <= upper
	public static void dfs(long num, long denom, int depth, int start){
		if(depth > n) return;
		double now = (double) num/denom;
		if(Math.abs(now-pq) < EPS){
			count++;
			return;
		}
		if(now > pq) return;
		for(int i=start; (double)(n-depth)/i+now+EPS >= pq && i*denom <= a; i++){
			dfs(num*i + denom, denom*i, depth+1, i);
		}
	}
}