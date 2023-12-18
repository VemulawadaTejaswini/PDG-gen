import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

//Square Carpets
public class Main{

	int w, h, res, L;
	int[][] a, t;
	boolean[][][] ok;
	Map<String, Integer> ref;
	
	void copy(int[][] a, int[][] b){
		for(int i=0;i<h;i++)for(int j=0;j<w;j++)b[i][j]=a[i][j];
	}
	
	String get(int[][] t){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<h;i++)for(int j=0;j<w;j++)sb.append(t[i][j]);
		return sb.toString();
	}
	
	void dump(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(a[i][j]==0)System.out.print("-");
				else if(t[i][j]==0)System.out.print("x");
				else System.out.print("o");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	class R implements Comparable<R>{
		int i, j, num, len;
		public R(int i, int j, int num, int len) {
			this.i = i;
			this.j = j;
			this.num = num;
			this.len = len;
		}
		public int compareTo(R o) {
			return num!=o.num?o.num-num:i*w+j-(o.i*w+o.j);
		}
	}
	
	boolean dfs(int step, int limit){
		if(res<=step)return false;
//		System.out.println("Step:"+step);
//		dump();
//		String r = get(t);
//		if(ref.containsKey(r)&&ref.get(r)<=step)return false;
//		ref.put(r, step);
		boolean e = false;
		int[][] p = new int[h][w];
		copy(t, p);
		for(int i=0;i<h;i++)for(int j=0;j<w;j++){
			if(a[i][j]==0||a[i][j]==1&&t[i][j]==1)continue;
			int hs = 0;
			for(int y=i;y+1<h;y++)for(int x=j;x<w;x++){
				if(x-1<0)continue;
				if(a[y][x-1]==0&&a[y][x]==1&&a[y+1][x-1]==1&&a[y+1][x]==1)hs+=2;
			}
			if(res<=step+hs)return false;
//			System.out.println("H:"+hs +" "+(step+h)+" res:"+res);
			e = true;
//			boolean f = false;
			PriorityQueue<R> q = new PriorityQueue<R>();
			for(int len=L;len>0;len--){
//				if(f)break;
				for(int y=i;y>i-len;y--){
					if(y<0||h<=y)continue;
					for(int x=j;x>j-len;x--){
//						System.out.println("Y:"+y+" X:"+x);
						if(x<0||w<=x)continue;
						if(!ok[y][x][len])continue;
						int cov = 0;
//						f = true;
//						boolean c = false;
						for(int n=y;n<y+len;n++)for(int m=x;m<x+len;m++){
							if(t[n][m]==0)cov++;
						}
						q.add(new R(y, x, cov, len));
					}
				}
			}
//			System.out.println(q.size());
			while(!q.isEmpty()){
				R v = q.poll();
				for(int y=v.i;y<v.i+v.len;y++)for(int x=v.j;x<v.j+v.len;x++)t[y][x] = 1;
				if(dfs(step+1, limit))return true;
				copy(p, t);
			}
			break;
		}
		if(!e)res = step;
		return !e;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			w = sc.nextInt(); h = sc.nextInt();
			if((w|h)==0)break;
			L = Math.min(h, w);
			a = new int[h][w];
			ok = new boolean[h][w][L+1];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)a[i][j]=sc.nextInt();
			for(int d=1;d<=L;d++)for(int i=0;i+d<=h;i++)for(int j=0;j+d<=w;j++){
				boolean f = true;
				for(int y=i;y<i+d;y++)for(int x=j;x<j+d;x++)if(a[y][x]==0)f = false;
				if(f)ok[i][j][d] = true;
			}
			res = w*h;
			ref = new HashMap<String, Integer>();
			t = new int[h][w];
			dfs(0, 0);
//			for(int i=0;i<=res;i++){
//				System.out.println("Limit:"+i);
//				if(dfs(0, i))res=i;
//			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}