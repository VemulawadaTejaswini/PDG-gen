import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Earth Observation with a Mobile Robot Team
public class Main{

	int INF = 1<<29;
	double EPS = 1e-6;
	double[] coltime;
	int[] k;
	int[][] x, y, t, vx, vy;
	
	int getK(int i, int time){
		int res = 0;
		while(res<k[i]){
			if(time<=t[i][res+1])return res;
			res++;
		}
		return -1;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), T = sc.nextInt(), R = sc.nextInt();
			if((n|T|R)==0)break;
			String[] name = new String[n];
			k = new int[n];
			x = new int[n][1001]; y = new int[n][1001]; t = new int[n][1001];
			vx = new int[n][1001]; vy = new int[n][1001];
			for(int i=0;i<n;i++){
				name[i] = sc.next();
				t[i][k[i]] = sc.nextInt(); x[i][k[i]] = sc.nextInt(); y[i][k[i]] = sc.nextInt();
				for(;;){
					int tt = sc.nextInt();
					vx[i][k[i]] = sc.nextInt();
					vy[i][k[i]] = sc.nextInt();
					k[i]++;
					t[i][k[i]] = tt;
					x[i][k[i]] = x[i][k[i]-1]+(tt-t[i][k[i]-1])*vx[i][k[i]-1];
					y[i][k[i]] = y[i][k[i]-1]+(tt-t[i][k[i]-1])*vy[i][k[i]-1];
					if(tt==T)break;
				}
//				System.out.println("I:"+i+" K:"+k[i]);
			}
			coltime = new double[n];
			Arrays.fill(coltime, INF);
			coltime[0] = 0;
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return (int) Math.signum(coltime[o1]-coltime[o2]);
				}
			});
			q.add(0);
			while(!q.isEmpty()){
				int a = q.poll();
//				System.out.println("Robot: " + name[a] + " V:"+coltime[a]);
				for(int b=0;b<n;b++){
					if(a==b||coltime[b]<coltime[a])continue;
					//left, right is time range.
					int left = 0, right = 0;;
					int ti = 1, tj = 1;
					while(ti<=k[a]&&tj<=k[b]){
						left = right;
						if(k[b]<tj){
							right = t[a][ti]; ti++;
						}
						else if(k[a]<ti){
							right = t[b][tj]; tj++;
						}
						else if(t[a][ti]<t[b][tj]){
							right = t[a][ti]; ti++;
						}
						else {
							right = t[b][tj]; tj++;
						}
						if(right<coltime[a]+EPS)continue;
						int ka = getK(a, left), kb = getK(b, left);
						double x1 = x[a][ka] + (left-t[a][ka])*vx[a][ka];
						double y1 = y[a][ka] + (left-t[a][ka])*vy[a][ka];
						double x2 = x[b][kb] + (left-t[b][kb])*vx[b][kb];
						double y2 = y[b][kb] + (left-t[b][kb])*vy[b][kb];
						double A = Math.pow(vx[a][ka]-vx[b][kb], 2)+Math.pow(vy[a][ka]-vy[b][kb], 2);
						double B = 2*(x1-x2)*(vx[a][ka]-vx[b][kb])+2*(y1-y2)*(vy[a][ka]-vy[b][kb]);
						double C = Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)-R*R;
						double D = B*B-4*A*C;
						if(D<0)continue;
						double t1 = (-B-Math.sqrt(D))/2/A+left, t2 = (-B+Math.sqrt(D))/2/A+left;
						if(t2<coltime[a]+EPS||t2<left+EPS||right<t1+EPS)continue;
						double r = Math.max(t1, Math.max(left, coltime[a]));
						if(r+EPS<coltime[b]){
							q.remove(b);
							coltime[b] = r;
//							System.out.println("Robot:"+name[a]+" and Robot:" + name[b]+" Col");
							q.add(b);
						}
						break;
					}
				}
			}
//			debug(coltime);
			PriorityQueue<String> res = new PriorityQueue<String>();
			for(int i=0;i<n;i++)if(coltime[i]!=INF)res.add(name[i]);
			while(!res.isEmpty())System.out.println(res.poll());
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}