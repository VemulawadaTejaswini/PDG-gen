
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	static class P {
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
		TestCase:while(true){
			int n=sc.nextInt();
			if(n==0)return;
			P[] ju=new P[n];
			for(int i=0;i<n;i++){
				ju[i]=new P(sc.nextInt(),sc.nextInt());
			}
			int m=sc.nextInt();
			int[][] mv=new int[m][2];
			for(int i=0;i<m;i++){
				String c=sc.next();
				if(c.equals("N"))mv[i][0]=0;
				if(c.equals("E"))mv[i][0]=1;
				if(c.equals("S"))mv[i][0]=2;
				if(c.equals("W"))mv[i][0]=3;

				mv[i][1]=sc.nextInt();
			}

			int[] dx=new int[]{0,1,0,-1};
			int[] dy=new int[]{1,0,-1,0};

			for(int sx=0;sx<=20;sx++)for(int sy=0;sy<=20;sy++){
				int x=sx,y=sy;
				BitSet jg=new BitSet(n);
				sim:for(int i=0;i<m;i++){
					for(int j=0;j<mv[i][1];j++){
						int ind=Arrays.binarySearch(ju,new P(x,y),new Comparator<P>(){
							@Override
							public int compare(P o1, P o2) {
								int x=o1.x-o2.x;
								if(x!=0)return x;
								return o1.y-o2.y;
							}
						});
						if(ind>=0)jg.set(ind);

						x+=dx[mv[i][0]];
						y+=dy[mv[i][0]];
						if(!(0<=x && x<=20 && 0<=y && y<=20))
							break sim;
					}
				}
				{
					int ind=Arrays.binarySearch(ju,new P(x,y),new Comparator<P>(){
						@Override
						public int compare(P o1, P o2) {
							int x=o1.x-o2.x;
							if(x!=0)return x;
							return o1.y-o2.y;
						}
					});
					if(ind>=0)jg.set(ind);
				}

				if(jg.cardinality()==n){
					ln("YES");continue TestCase;
				}
			}
			ln("NO");
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