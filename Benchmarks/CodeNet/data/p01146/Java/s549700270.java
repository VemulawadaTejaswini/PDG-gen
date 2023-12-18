import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int INF=1<<26;
	final double EPS=1.0e-08;
	public static void main(String[] args) {
		//long s=System.currentTimeMillis();
		new Main().AOJ2021();
		//out.println((System.currentTimeMillis()-s)+"msec");
	}
	
	void AOJ2021(){
		while(true){
			int N=sc.nextInt(),M=sc.nextInt(),L=sc.nextInt(),K=sc.nextInt(),A=sc.nextInt(),H=sc.nextInt();
			if(N==0)	break;
			int[][] d=new int[N][N];
			int[] l=new int[L+1];
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					if(i==j)	continue;
					d[i][j]=INF;
				}
			}
			for(int i=0; i<L; i++)	l[i]=sc.nextInt();
			l[L]=H;
			for(int i=0; i<K; i++){
				int x=sc.nextInt(),y=sc.nextInt(),t=sc.nextInt();
				d[x][y]=t;	d[y][x]=t;
			}
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					for(int k=0; k<N; k++)	d[i][j]=min(d[i][j],d[i][k]+d[k][j]);
				}
			}
			PriorityQueue<C2021> open=new PriorityQueue<C2021>();
			open.add(new C2021(A,M,0));
			int[][] close=new int[N][M+1];
			for(int i=0; i<N; i++){
				for(int j=0; j<=M; j++)	close[i][j]=INF;
			}
			close[A][M]=0;
			int ans=INF;
			while(!open.isEmpty()){
				C2021 now=open.poll();
				for(int i=0; i<=L; i++){
					if(now.now==l[i])	continue;
					if(d[now.now][l[i]]>M)	continue;
					int t=now.time+d[now.now][l[i]],r=now.remain-d[now.now][l[i]];
					if(r<0){
						t+=-1*r;
						r=0;
					}
					if(close[l[i]][r]<=t)	continue;
					if(l[i]==H){
						ans=min(ans,t);
						continue;
						//break;
					}
					open.add(new C2021(l[i],r,t));
					close[l[i]][r]=t;
				}
			}
			System.out.println((ans>=INF?"Help!":ans));
		}
	}
	class C2021 implements Comparable<C2021>{
		int now,remain,time;
		C2021(int n,int r,int t){this.now=n; this.remain=r; this.time=t;}
		@Override public int compareTo(C2021 o) {
			if(this.time<o.time)	return -1;
			if(this.time>o.time)	return 1;
			return 0;
		}
	}
	
	void AOJ2151(){
		while(true){
			int N=sc.nextInt(),M=sc.nextInt(),L=sc.nextInt();
			if(N==0)	break;
			int[][] cost=new int[N+1][N+1],robber=new int[N+1][N+1];
			for(int i=0; i<=N; i++){
				for(int j=0; j<=N; j++){
					if(i==j)	continue;
					cost[i][j]=INF;	robber[i][j]=INF;
				}
			}
			for(int i=0; i<M; i++){
				int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
				cost[a][b]=c;	cost[b][a]=c;
				robber[a][b]=d;	robber[b][a]=d;
			}
			PriorityQueue<C2151> open=new PriorityQueue<C2151>();
			open.add(new C2151(1,L,0));
			int[][] close=new int[N+1][L+1];
			for(int i=0; i<=N; i++){
				for(int j=0; j<=L; j++)	close[i][j]=INF;
			}
			close[1][L]=0;
			int ans=INF;
			while(!open.isEmpty()){
				C2151 now=open.poll();
				for(int i=1; i<=N; i++){
					if(now.now==i)	continue;
					if(cost[now.now][i]>=INF)	continue;
					if(now.remains>=cost[now.now][i]){
						int re2=now.remains-cost[now.now][i];
						if(close[i][re2]>now.robbers){
							if(i==N){
								ans=min(ans,now.robbers);
								continue;
							}else{
								open.add(new C2151(i,re2,now.robbers));
								close[i][re2]=now.robbers;
							}
						}
					}
					int rob2=now.robbers+robber[i][now.now];
					if(close[i][now.remains]<=rob2)	continue;
					if(i==N)	ans=min(ans,rob2);
					else{
						open.add(new C2151(i,now.remains,rob2));
						close[i][now.remains]=rob2;
					}
				}
			}
			System.out.println(ans);
		}
	}
	class C2151 implements Comparable<C2151>{
		int now,remains,robbers;
		C2151(int n,int r,int r2){this.now=n; this.remains=r; this.robbers=r2;}
		@Override public int compareTo(C2151 o) {
			if(this.robbers<o.robbers)	return -1;
			if(this.robbers>o.robbers)	return 1;
			return 0;
		}
	}
	
	void AOJ1144(){
		while(true){
			int W=sc.nextInt(),H=sc.nextInt(),sx=0,sy=0;
			if((W|H)==0)	break;
			int[][] b=new int[W][H];
			for(int y=0; y<H; y++){
				for(int x=0; x<W; x++){
					b[x][y]=sc.nextInt();
					if(b[x][y]==2){
						sx=x;	sy=y;
					}
				}
			}
			PriorityQueue<C1144> open=new PriorityQueue<C1144>();
			int[] temp=new int[10];
			Arrays.fill(temp, -1);
			open.add(new C1144(sx,sy,0,temp,temp));
			TreeSet<C1144> close=new TreeSet<C1144>();
			close.add(new C1144(sx,sy,0,temp,temp));
			int ans=INF;
			while(!open.isEmpty()){
				C1144 now=open.poll();
				for(int i=0; i<4; i++){
					int xx=now.x,yy=now.y;
					if((0<=xx+vx[i] && xx+vx[i]<W && 0<=yy+vy[i] && yy+vy[i]<H) && b[xx+vx[i]][yy+vy[i]]==1 && !now.stone(xx+vx[i], yy+vy[i]))	continue;
					while(true){
						xx+=vx[i];	yy+=vy[i];
						if(!(0<=xx && xx<W && 0<=yy && yy<H))	break;
						if(b[xx][yy]==3){
							ans=min(ans,now.step+1);
							break;
						}
						if(b[xx][yy]==1 && !now.stone(xx, yy)){
							if(now.step==9)	break;
							int[] tx=now.x2.clone(),ty=now.y2.clone();
							for(int j=0; j<10; j++){
								if(tx[j]<0 && ty[j]<0){
									tx[j]=xx;	ty[j]=yy;
									break;
								}
							}
							xx-=vx[i];	yy-=vy[i];
							C1144 next=new C1144(xx,yy,now.step+1,tx,ty);
							if(close.contains(next))	break;
							open.add(next);
							close.add(next);
						}
					}
				}
			}
			System.out.println((ans>=INF?"-1":ans));
		}
	}
	class C1144 implements Comparable<C1144>{
		int x,y,step;
		int[] x2,y2;
		C1144(int x,int y,int step,int[] x2,int[] y2){this.x=x; this.y=y; this.step=step; this.x2=x2; this.y2=y2;}
		@Override public int compareTo(C1144 o) {
			if(this.step<o.step)	return -1;
			if(this.step>o.step)	return 1;
			if(Arrays.equals(this.x2, o.x2) && Arrays.equals(this.y2, o.y2))	return 0;
			return -1;
		}
		boolean stone(int x,int y){
			for(int i=0; i<10; i++){
				if(x2[i]<0 && y2[i]<0)	return false;
				if(x2[i]==x && y2[i]==y)	return true;
			}
			return false;
		}
	}
	
	// TLE ゲノム
	void AOJ1145(){
		while(true){
			StringBuilder line=new StringBuilder(sc.next());
			int n=sc.nextInt();
			if(line.toString().equals("0"))	break;
			char last=line.charAt(0);
			for(int i=1; i<line.length(); i++){
				if(Character.isDigit(last)){
					if(Character.isUpperCase(line.charAt(i)))	line.insert(i++, '*');
					else if(line.charAt(i)=='(')	line.insert(i++, '*');
				}else if(Character.isUpperCase(last)){
					if(Character.isUpperCase(line.charAt(i)))	line.insert(i++, '+');
					else if(Character.isDigit(line.charAt(i)))	line.insert(i++, '+');
				}else if(last==')' && line.charAt(i)!=')')	line.insert(i++, '+');
				last=line.charAt(i);
			}
			line.append("#");
			System.out.println("L: "+line);
			System.out.println(new parsed1145(line.toString(), n).toString());
		}
	}
	class parsed1145{
		String line,ans="",ans2;
		int pos=0,n;
		public parsed1145(String line, int n) { this.line=line; this.n=n; ans2=expr();}
		private String expr(){
			if(n<0)	return "";
			String res=term();
			while(true){
				char op=line.charAt(pos);
				if(op=='+'){
					pos++;
					res+=term();
				}else	break;
			}
//			System.out.println("E: "+res+" N"+n);
//			if(res.length()<=n){
//				n-=res.length();
//				res="";
//			}else{
//				try{
//					ans=""+res.charAt(n);
//				}catch(Exception e){}
//				res="";
//				n=-1;
//				pos=line.length()-1;
//			}
			return res;
		}
		private String term(){
			if(n<0)	return "";
			String res=fact();
			while(true){
				char op=line.charAt(pos);
				if(op=='*'){
					int t=Integer.parseInt(res);
					pos++;
					res=fact();
					StringBuilder sb=new StringBuilder();
					while(--t>=0)	sb.append(res);
					res=sb.toString();
//					System.out.println("T: "+res+" N"+n);
//					if(res.length()<=n){
//						n-=res.length();
//						res="";
//					}else{
//						try{
//							ans=""+res.charAt(n);
//							System.out.println("* "+res+" N"+n);
//						}catch(Exception e){}
//						res="";
//						n=-1;
//						pos=line.length()-1;
//					}
				}else	break;
			}
//			System.out.println("T: "+res+" N"+n);
//			if(res.length()<=n){
//				n-=res.length();
//				res="";
//			}else{
//				try{
//					ans=""+res.charAt(n);
//					System.out.println("* "+res+" N"+n);
//				}catch(Exception e){}
//				res="";
//				n=-1;
//				pos=line.length()-1;
//			}
			return res;
		}
		private String fact(){
			if(n<0)	return "";
			if(Character.isDigit(line.charAt(pos))){
				String t=""+(line.charAt(pos)-'0');
				pos++;
				while(Character.isDigit(line.charAt(pos))){
					t+=(line.charAt(pos)-'0');
					pos++;
				}
				return t;
			}else if(line.charAt(pos)=='('){
				pos++;
				String res=expr();
				pos++;
				//System.out.println(res+" N"+n);
//				if(res.length()<=n){
//					n-=res.length();
//				}else{
//					try{
//						ans=""+res.charAt(n);
//					}catch(Exception e){}
//					res="";
//					n=-1;
//					pos=line.length()-1;
//				}
				return res;
			}else if(Character.isUpperCase(line.charAt(pos))){
				return ""+line.charAt(pos++);
			}
			return "";
		}
		@Override public String toString() {	return ans.length()==0?"0":ans;}
	}
	
	void AOJ1165(){
		final int[] vx2={-1,0,1,0}, vy2={0,-1,0,1};
		while(true){
			int N=sc.nextInt();
			if(N==0)	break;
			int[] x=new int[N],y=new int[N];
			for(int i=1; i<N; i++){
				int n=sc.nextInt(),d=sc.nextInt();
				x[i]=x[n]+vx2[d];	y[i]=y[n]+vy2[d];
			}
			Arrays.sort(x);	Arrays.sort(y);
			System.out.println((x[N-1]-x[0]+1)+" "+(y[N-1]-y[0]+1));
		}
	}
	
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
}