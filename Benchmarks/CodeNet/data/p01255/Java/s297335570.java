import java.util.Arrays;
import java.util.Scanner;

//Webby Subway
public class Main{

	final double EPS = 1e-8;
	double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}
	double norm(double[] a, double[] b){
		return Math.hypot(a[0]-b[0], a[1]-b[1]);
	}
	double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	double ex(double[] a, double[] b, double[] c){
		double[] s1 = sub(b, a), s2 = sub(c, a);
		return cross(s1, s2);
	}
	boolean crossing(double[] a, double[] b, double[] s, double[] t){
		if(Math.abs(cross(sub(b, a), sub(t, s)))<EPS){
			return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))))<EPS;
		}
		if(ex(a, b, s)*ex(a, b, t)>0)return false;
		if(ex(b, a, s)*ex(b, a, t)>0)return false;
		if(ex(s, t, a)*ex(s, t, b)>0)return false;
		return ex(t, s, a)*ex(t, s, b)<EPS;
	}
	double dist(double[] a, double[] b, double[] p){
		if(dot(sub(b, a), sub(p, a))<EPS)return norm(a, p);
		if(dot(sub(a, b), sub(p, b))<EPS)return norm(b, p);
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	int[] bipartiteMatching(boolean[][] graph) {
		int n = graph.length;
		if(n==0)return new int[0];
		int m = graph[0].length;
		int[] match = new int[m];
		Arrays.fill(match, -1);
		int res = 0;
		for (int i = 0; i < n; i++) {
			boolean[] visited = new boolean[m];
			if (go(i,graph,visited,match)) res++;
		}
		return match;
	}
	boolean go(int v,boolean[][] graph,boolean[] visited,int[] match) {
		int m = graph[0].length;
		for (int i = 0; i < m; i++)  if (!visited[i] && graph[v][i] && match[i] == -1) {
			visited[i] = true;
			match[i] = v;
			return true;
		}
		for (int i = 0; i < m; i++) if (!visited[i] && graph[v][i]) {
			visited[i] = true;
			if (go(match[i],graph,visited,match)) {
				match[i] = v;
				return true;
			}
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			double[][][] seg = new double[n][][];
			for(int i=0;i<n;i++){
				int k = sc.nextInt();
				seg[i] = new double[k][2];
				for(int j=0;j<k;j++)for(int c=0;c<2;c++)seg[i][j][c] = sc.nextDouble();
			}
			boolean[][] m = new boolean[n][n];
			for(int i=0;i<n;i++)for(int j=i+1;j<n;j++){
				boolean f = true;
				int k1 = seg[i].length, k2 = seg[j].length;
				for(int a=0;f&&a+1<k1;a++)for(int b=0;f&&b+1<k2;b++){
					if(crossing(seg[i][a], seg[i][a+1], seg[j][b], seg[j][b+1]))f = false;
				}
				m[i][j]=m[j][i]=f;
			}
			int[] r = bipartiteMatching(m);
			int c = 0, f = 0;
			for(int x:r)if(x!=-1)c=1;else f++;
			System.out.println(Math.max(f+c, 1));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}