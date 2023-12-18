import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int[] vvx={0,1,0,-1,-1,1}, vvy={-1,0,1,0,-1,1};
	final int INF=1<<24;
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		//long s=System.currentTimeMillis();
		new Main().AOJ2252();
		//out.println((System.currentTimeMillis()-s)+"msec");
	}
	
	// 2011MOGI - A 15:02
	void AOJ2252(){
		HashSet<Character> right=new HashSet<Character>();
		right.add('y');	right.add('h');	right.add('n');	right.add('u');	right.add('j');	right.add('m');
		right.add('i');	right.add('k');	right.add('o');	right.add('l');	right.add('p');
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			if(c[0]=='#')	break;
			boolean r=false;
			if(right.contains(c[0]))	r=true;
			int ans=0;
			for(int i=1; i<c.length; i++){
				if(right.contains(c[i])){
					ans+=!r?1:0;
					r=true;
				}else{
					ans+=r?1:0;
					r=false;
				}
			}
			out.println(ans);
		}
	}
	
	// 2012MOGI - A	14:50-14:57
	void AOJ2399(){
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0)	break;
			boolean[][] b=new boolean[N+1][N+1];
			for(int i=1; i<=N; i++){
				int m=sc.nextInt();
				for(int j=0; j<m; j++)	b[i][sc.nextInt()]=true;
			}
			boolean[] ans=new boolean[N+1];
			Arrays.fill(ans, true);
			int k=sc.nextInt();
			for(int i=0; i<k; i++){
				int p=sc.nextInt();
				for(int j=1; j<=N; j++){
					if(!b[j][p])	ans[j]=false;
				}
			}
			int res=-1;
			for(int i=1; i<=N; i++){
				if(ans[i]){
					if(res<0)	res=i;
					else{
						res=-1;
						break;
					}
				}
			}
			out.println(res);
		}
	}
	
	
	// AOJ2254 2011MOGI - B
	void B(){
		while(sc.hasNext()){
			int t=sc.nextInt(),n=sc.nextInt(),ans=0;
			if((t|n)==0)	break;
			boolean[][] b=new boolean[210][210];
			for(int i=0; i<n; i++)	b[sc.nextInt()+100][sc.nextInt()+100]=true;
			int sx=sc.nextInt()+100,sy=sc.nextInt()+100;
			LinkedList<ClassB> open=new LinkedList<ClassB>();
			open.add(new ClassB(sx,sy,0));
			boolean[][] close=new boolean[210][210];
			close[sx][sy]=true;
			while(!open.isEmpty()){
				ClassB now=open.poll();
				ans++;
				if(now.t>=t)	continue;
				for(int i=0; i<6; i++){
					int xx=now.x+vvx[i],yy=now.y+vvy[i];
					//if(!Point.ok(0xx, yy, 100, 100))	continue;
					if(close[xx][yy])	continue;
					if(b[xx][yy])	continue;
					open.add(new ClassB(xx,yy,now.t+1));
					close[xx][yy]=true;
				}
			}
			out.println(ans);
		}
	}
	class ClassB{
		int x,y,t;
		ClassB(int x,int y,int t){this.x=x; this.y=y; this.t=t;}
	}
}