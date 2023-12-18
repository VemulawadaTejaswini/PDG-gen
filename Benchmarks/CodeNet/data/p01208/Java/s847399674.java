import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

//Turn Left
public class Main{

	double EPS = 1e-10;
	int INF = 1<<29, M = 1000;
	int[] x, y;
	boolean ok(int pre, int v, int next){
		int x1 = x[v]-x[pre], y1 = y[v]-y[pre], x2 = x[next]-x[pre], y2 = y[next]-y[pre];
		return x1*y2-x2*y1>=0;
	}
	
	int[][] pass;
	double[][] d;
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int m = sc.nextInt(), n = sc.nextInt();
			if((m|n)==0)break;
			Map<String, Integer> ref = new HashMap<String, Integer>();
			x = new int[m]; y = new int[m];
			String[] str = new String[m];
			for(int i=0;i<m;i++){
				String s = sc.next();
				ref.put(s, i);
				str[i] = s;
				x[i] = sc.nextInt(); y[i] = sc.nextInt();
			}
			double[][] dist = new double[m][m];
			List<Integer>[] adj = new List[m];
			for(int i=0;i<m;i++)adj[i]=new ArrayList<Integer>();
			Set<Integer> set = new HashSet<Integer>();
			while(n--!=0){
				int s = ref.get(sc.next()), t = ref.get(sc.next());
				set.add(s*M+t);
				adj[s].add(t); adj[t].add(s);
				dist[s][t] = dist[t][s] = Math.sqrt((x[s]-x[t])*(x[s]-x[t])+(y[s]-y[t])*(y[s]-y[t]));
			}
			
//			for(int v:set){
//				int a = v/M, b = v%M;
//				for(int k:adj[a]){
//					System.out.println(str[b]+"->"+str[a]+"->"+str[k]+" is:"+ok(b, a, k));
//				}
//				for(int k:adj[b]){
//					System.out.println(str[a]+"->"+str[b]+"->"+str[k]+" is:"+ok(a, b, k));
//				}
//				System.out.println();
//			}
			
			
			int s = ref.get(sc.next()), g = ref.get(sc.next());
			d = new double[m][m];
			for(double[]a:d)Arrays.fill(a, INF);
			pass = new int[m][m];
			for(int[]a:pass)Arrays.fill(a, INF);
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(m, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					if(Math.abs(d[o1/M][o1%M]-d[o2/M][o2%M])<EPS)return pass[o1/M][o1%M]-pass[o2/M][o2%M];
					return (int)Math.signum(d[o1/M][o1%M]-d[o2/M][o2%M]);
				}
			});
			for(int v:adj[s]){
				d[v][s] = dist[s][v]; pass[v][s] = 2;
				q.add(v*M+s);
			}
			int res = INF;
			while(!q.isEmpty()){
				int a = q.poll();
				int v = a/M, pre = a%M;
				if(v==g){
					res = pass[v][pre];
					break;
				}
				for(int k:adj[v]){
					if(k==pre)continue;
					if(!ok(pre, v, k))continue;
					double w = d[v][pre] + dist[v][k];
					int t = pass[v][pre]+1;
					if(Math.abs(w-d[k][v])<EPS&&t<pass[k][v]){
						pass[k][v] = t; q.add(k*M+v);
					}
					else if(w<d[k][v]){
						d[k][v] = w; pass[k][v] = t; q.add(k*M+v);
					}
				}
			}
			System.out.println(res==INF?"impossible":res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}