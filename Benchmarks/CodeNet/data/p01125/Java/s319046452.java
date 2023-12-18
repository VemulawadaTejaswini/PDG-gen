
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();



	int[] dx=new int[]{0,1,0,-1};
	int[] dy=new int[]{1,0,-1,0};

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)return;
			boolean[][] jumap=new boolean[21][21];
			for(int i=0;i<n;i++){
				jumap[sc.nextInt()][sc.nextInt()]=true;
			}
			int juc=0;

			int x=10,y=10;
			if(jumap[x][y]){
				juc++;
				jumap[x][y]=false;
			}
			int m=sc.nextInt();
			while(m--!=0){
				char d=sc.next().toCharArray()[0];
				int t=sc.nextInt();
				int di=0;
				if(d=='E')di=1;
				if(d=='S')di=2;
				if(d=='W')di=3;
				for(int i=0;i<t;i++){
					x+=dx[di];
					y+=dy[di];
					if(jumap[x][y]){
						juc++;
						jumap[x][y]=false;
					}
				}
			}
			ln((juc==n)?"YES":"NO");
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