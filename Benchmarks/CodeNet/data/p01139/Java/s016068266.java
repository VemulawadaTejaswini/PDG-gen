
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	class P{
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

	int[][] dr=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};

	public void run() {
		while(true){
			int W=sc.nextInt(),H=sc.nextInt();
			if(W==0 && H==0)return;

			char[][] map=new char[H][W];
			for(int h=0;h<H;h++){
				map[h]=sc.next().toCharArray();
			}
			int wc=0,bc=0;

			smap:while(true){
				Queue<P> que=new LinkedList<P>();
				int c=0;
				sdot:for(int h=0;h<H;h++)for(int w=0;w<W;w++){
					if(map[h][w]=='.'){
						que.add(new P(w,h));
						map[h][w]='-';
						c++;
						break sdot;
					}
				}
				if(que.isEmpty())break smap;
				int color=0;
				while(!que.isEmpty()){
					P p=que.poll();

					for(int i=0;i<4;i++){
						int x=p.x+dr[i][0];
						int y=p.y+dr[i][1];
						if(0<=x&& x<W && 0<=y && y<H){
							switch(map[y][x]){
							case '.':
								map[y][x]='-';
								c++;
								que.add(new P(x,y));
								break;
							case 'B':
								if(color==2)color=-1;
								if(color==0)color=1;
								break;
							case 'W':
								if(color==1)color=-1;
								if(color==0)color=2;
								break;
							}
						}
					}
				}
				if(color==1)
					bc+=c;
				if(color==2)
					wc+=c;
			}
			ln(bc+" "+wc);
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