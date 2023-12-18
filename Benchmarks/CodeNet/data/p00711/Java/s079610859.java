import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	static class P{
		int x;
		int y;
		public P(int x,int y){
			this.x=x;this.y=y;
		}

		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof P))return false;
			P p=(P)obj;
			return p.x==x && p.y==y;
		}
		@Override
		public String toString() {
			return "("+x+","+y+")";
		}
	}

	public void run() {
		Test:while(true){
			int w=sc.nextInt(),h=sc.nextInt();
			if(w==0 && h==0)return;
			boolean[][] wall=new boolean[h][w];
			Queue<P> pq=new LinkedList<P>();
			for(int i=0;i<h;i++){
				char[] mc=sc.next().toCharArray();
				for(int j=0;j<w;j++){
					switch(mc[j]){
					case '#':
						wall[i][j]=true;
						break;
					case '@':
						wall[i][j]=true;
						pq.offer(new P(j,i));
					}
				}
			}

			int res=1;

			int[][] d=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
			while(!pq.isEmpty()){
				P p=pq.poll();
				for(int i=0;i<4;i++){
					int x=p.x+d[i][0];
					int y=p.y+d[i][1];
					if(0<=x && x<w && 0<=y && y<h){
						if(!wall[y][x]){
							wall[y][x]=true;
							res++;
							pq.add(new P(x,y));
						}
					}
				}
			}
			ln(res);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}