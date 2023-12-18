import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	char[][] map;
	boolean[][] removed;
	int ans, max;
	HashSet<Integer> set;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		map=new char[n][];
		for(int j=0; j<n; j++){
			map[j]=sc.next().toCharArray();
			for(int i=0; i<m; i++){
				if(map[j][i]!='.'){
					max++;
				}
			}
		}
		max/=2;
		ans=0;
		removed=new boolean[n][m];
		set=new HashSet<Integer>();
		dfs(0);
		println(ans+"");
	}

	void dfs(int bit){
		ans=max(ans, Integer.bitCount(bit)*2);

		if(set.contains(bit)){
			return;
		}
		set.add(bit);

		// debug(Integer.toBinaryString(bit));

		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};
		for(int y=0; y<n; y++){
			for(int x=0; x<m; x++){
				if(map[y][x]=='.'||removed[y][x]){}else{
					continue;
				}
				P[] ps=new P[4];
				for(int k=0; k<4; k++){
					ps[k]=get(x, y, dx[k], dy[k]);
				}
				int b=0;
				for(int j=0; j<4; j++){
					for(int i=j+1; i<4; i++){
						if(ps[i]!=null&&ps[j]!=null
								&&map[ps[i].y][ps[i].x]==map[ps[j].y][ps[j].x]){
							// s+=2;
							b|=1<<(map[ps[i].y][ps[i].x]-'A');
							removed[ps[i].y][ps[i].x]=true;
							removed[ps[j].y][ps[j].x]=true;
						}
					}
				}
				if(b>0){
					// debug(ps[0], ps[1], ps[2], ps[3]);
					dfs(bit|b);
					for(int i=0; i<4; i++){
						if(ps[i]!=null){
							removed[ps[i].y][ps[i].x]=false;
						}
					}
				}
			}
		}
	}

	P get(int x, int y, int dx, int dy){
		for(; x>=0&&x<m&&y>=0&&y<n; x+=dx, y+=dy){
			if(!removed[y][x]&&map[y][x]!='.'){
				return new P(x, y);
			}
		}
		return null;
	}

	class P{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}

		@Override
		public String toString(){
			return "("+x+","+y+")";
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}