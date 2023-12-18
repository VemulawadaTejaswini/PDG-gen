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
	int ans;
	int type='Z'-'A'+1;
	LinkedList<P> pList;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		map=new char[n][];
		for(int j=0; j<n; j++){
			map[j]=sc.next().toCharArray();
		}

		@SuppressWarnings("unchecked")
		LinkedList<P>[] lists=new LinkedList[type];
		for(int i=0; i<type; i++){
			lists[i]=new LinkedList<P>();
		}
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(map[j][i]!='.'){
					lists[map[j][i]-'A'].add(new P(i, j));
				}
			}
		}
		
		pList=new LinkedList<P>();
		for(int i=0; i<type; i++){
			if(lists[i].size()==2){
				P p1=lists[i].get(0);
				P p2=lists[i].get(1);
				if(p1.x==p2.x){
					for(int y=min(p1.y, p2.y)+1; y<max(p1.y, p2.y); y++){
						pList.add(new P(p1.x, y));
					}
				}else if(p1.y==p2.y){
					for(int x=min(p1.x, p2.x)+1; x<max(p1.x, p2.x); x++){
						pList.add(new P(x, p1.y));
					}
				}else{
					pList.add(new P(p1.x, p2.y));
					pList.add(new P(p2.x, p1.y));
				}
			}
		}

		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};

		ans=0;
		removed=new boolean[n][m];
		for(;;){
			int s=0;
			for(P p : pList){
				if(map[p.y][p.x]=='.'||removed[p.y][p.x]){}else{
					continue;
				}
				P[] ps=new P[4];
				for(int k=0; k<4; k++){
					ps[k]=get(p.x, p.y, dx[k], dy[k]);
				}
				for(int j=0; j<4; j++){
					for(int i=j+1; i<4; i++){
						if(ps[i]!=null&&ps[j]!=null
								&&map[ps[i].y][ps[i].x]==map[ps[j].y][ps[j].x]){
							removed[ps[i].y][ps[i].x]=true;
							removed[ps[j].y][ps[j].x]=true;
							s+=2;
						}
					}
				}
			}
			ans+=s;
			if(s==0){
				break;
			}
		}
		println(ans+"");
	}

	P get(int x, int y, int dx, int dy){
		for(x+=dx, y+=dy; x>=0&&x<m&&y>=0&&y<n; x+=dx, y+=dy){
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