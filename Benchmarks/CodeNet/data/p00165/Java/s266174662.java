import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ0165();
	}
	class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
	}
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	
	void AOJ0165(){
		final int MAX=1000000;
		boolean[] prime=Sieve(MAX);
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0)	break;
			int ans=0;
			for(int i=1; i<=N; i++){
				int p=sc.nextInt(), m=sc.nextInt();
				int min=max(0,p-m), max=min(MAX, p+m);
				int temp=(min<=2?1:0);
				for(int j=(min%2==0?min+1:min); j<=max; j+=2){
					if(prime[j])	temp++;
				}
				out.println("TEMP"+temp);
				ans+=(temp==0?-1:temp-1);
			}
			out.println(max(0,ans));
		}
	}
	
	void AOJ1144(){
		while(sc.hasNext()){
			int X=sc.nextInt(), Y=sc.nextInt();
			if((X|Y)==0)	break;
			char[][] c=new char[X][Y];
			for(int y=0; y<Y; y++){
				String line=sc.next();
				for(int x=0; x<X; x++){
					c[x][y]=line.charAt(x);
				}
			}
		}
	}
	
	
	// TODO 果樹園　RE　横型
	void AOJ0118(){
		while(sc.hasNext()){
			int X=sc.nextInt(), Y=sc.nextInt(), ans=0;
			if((X|Y)==0)	break;
			char[][] c=new char[X+10][Y+10];
			for(int y=0; y<Y; y++){
				String line=sc.next();
				for(int x=0; x<X; x++){
					c[x][y]=line.charAt(x);
				}
			}
			for(int x=0; x<X; x++){
				for(int y=0; y<Y; y++){
					if(c[x][y]=='&')	continue;
					ans++;
					LinkedList<Point> open=new LinkedList<Point>();
					open.add(new Point(x,y));
					char mark=c[x][y];
					while(!open.isEmpty()){
						Point now=open.poll();
						c[now.x][now.y]='&';
						for(int i=0; i<4; i++){
							if(now.x+vx[i]<0 || now.x+vx[i]>=X || now.y+vy[i]<0 || now.y+vy[i]>=Y)	continue;
							if(c[now.x+vx[i]][now.y+vy[i]]==mark){
								//out.println((now.x+vx[i])+" "+(now.y+vy[i]));
								open.add(new Point(now.x+vx[i],now.y+vy[i]));
								c[now.x+vx[i]][now.y+vy[i]]='&';
							}
						}
					}
					//out.println("ANS"+ans);
				}
			}
			out.println(ans);
		}
	}
	
	// Red and Black 横型探索
	void AOJ1130(){
		while(sc.hasNext()){
			int X=sc.nextInt(), Y=sc.nextInt(),sx=0,sy=0,ans=0;
			if(X==0)	break;
			char[][] c=new char[X][Y];
			for(int y=0; y<Y; y++){
				char[] line=sc.next().toCharArray();
				for(int x=0; x<X; x++){
					c[x][y]=line[x];
					if(line[x]=='@'){
						sx=x;	sy=y;
					}
				}
			}
			LinkedList<Point> open=new LinkedList<Point>();
			open.add(new Point(sx,sy));
			boolean[][] close=new boolean[X][Y];
			while(!open.isEmpty()){
				ans++;
				Point now=open.poll();
				close[now.x][now.y]=true;
				for(int i=0; i<4; i++){
					if(now.x+vx[i]<0 || now.x+vx[i]>=X || now.y+vy[i]<0 || now.y+vy[i]>=Y)	continue;
					if(c[now.x+vx[i]][now.y+vy[i]]=='.' && !close[now.x+vx[i]][now.y+vy[i]]){
						open.add(new Point(now.x+vx[i], now.y+vy[i]));
						close[now.x+vx[i]][now.y+vy[i]]=true;
					}
				}
			}
			out.println(ans);
		}
	}
	
	// TODO デパート　TLE MLE WA
	void AOJ0223(){
		while(sc.hasNext()){
			int X=sc.nextInt(),	Y=sc.nextInt();
			if(X==0)	break;
			int tx=sc.nextInt(), ty=sc.nextInt(), kx=sc.nextInt(), ky=sc.nextInt();
			int[][] b=new int[X+1][Y+1];
			for(int y=1; y<=Y; y++){
				for(int x=1; x<=X; x++)	b[x][y]=sc.nextInt();
			}
			LinkedList<C0223> open=new LinkedList<C0223>();
			open.add(new C0223(tx,ty,kx,ky,0));
			int[][][][] close2=new int[X+1][Y+1][X+1][Y+1];
			close2[tx][ty][kx][ky]=-1;
			int ans=-1;
			while(!open.isEmpty()){
				C0223 now=open.poll();
				if(now.ans()){
					ans=now.sec;
					break;
				}
				if(now.sec>=99)	break;
				for(int i=0; i<4; i++){
					if(0<now.tx+vx[i]&&now.tx+vx[i]<=X && 0<now.ty+vy[i]&&now.ty+vy[i]<=Y && 0<now.kx-vx[i]&&now.kx-vx[i]<=X && 0<now.ky-vy[i]&&now.ky-vy[i]<=Y){
						tx=now.tx;	ty=now.ty;	kx=now.kx;	ky=now.ky;
						if(b[tx+vx[i]][ty+vy[i]]==0){
							tx+=vx[i];	ty+=vy[i];
						}
						if(b[kx-vx[i]][ky-vy[i]]==0){
							kx-=vx[i];	ky-=vy[i];
						}
						//out.println("TEMP:"+tx+" "+ty+" "+kx+" "+ky);
						//if(tx==kx && ty==ky)	ans=ans<0?now.sec+1:min(ans,now.sec+1);
						if(close2[tx][ty][kx][ky]==0 || close2[tx][ty][kx][ky]>now.sec+1){
							//out.println("ADD:"+tx+" "+ty+" "+kx+" "+ky);
							open.add(new C0223(tx,ty,kx,ky,now.sec+1));
							close2[tx][ty][kx][ky]=now.sec+1;
						}
					}
				}
			}
			out.println(ans<0? "NA": ans);
		}
	}
	class C0223{
		int tx,ty,kx,ky,sec;
		C0223(int tx, int ty, int kx, int ky, int sec){
			this.tx=tx;	this.ty=ty;	this.kx=kx;	this.ky=ky;	this.sec=sec;
		}
		boolean ans(){
			if(this.tx==this.kx && this.ty==this.ky)	return true;
			else	return false;
		}
	}
	
	
	// TODO WA
	void AOJ0142(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int nn=(n-1)/2;
			boolean[] b=new boolean[n];
			for(int i=1; i<n; i++)	b[(i*i)%n]=true;
			ArrayList<Integer> ar=new ArrayList<Integer>();
			for(int i=1; i<n; i++){
				if(b[i])	ar.add(i);
			}
			int[] ans=new int[nn+1];
			for(int i=0; i<ar.size(); i++){
				for(int j=0; j<ar.size(); j++){
					if(i==j)	continue;
					int temp=ar.get(i)-ar.get(j);
					temp+= temp<0? n:0;
					temp= temp>nn? n-temp: temp;
					ans[temp]++;
				}
			}
			for(int i=1; i<=nn; i++)	out.println(ans[i]);
		}
	}
	
	
	// TODO レゴ　WA
	void AOJ0207(){
		while(sc.hasNext()){
			int w=sc.nextInt(), h=sc.nextInt();
			if(w==0)	break;
			int sx=sc.nextInt(), sy=sc.nextInt(), gx=sc.nextInt(), gy=sc.nextInt(), n=sc.nextInt();
			int[][] b=new int[w+2][h+2];
			for(int i=0; i<n; i++){
				int color=sc.nextInt(), d=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
				if(d==0){	// 横 4x2
					for(int j=y; j<y+2; j++){
						for(int k=x; k<x+4; k++)	b[k][j]=color;
					}
				}else{	// 縦 2x4
					for(int j=y; j<y+4; j++){
						for(int k=x; k<x+2; k++)	b[k][j]=color;
					}
				}
			}
			//debug
			//de0207(b,w,h);
			int[] vx={1,0,-1,0}, vy={0,1,0,-1};
			int xx=sx, yy=sy, cc=b[sx][sy], v=0, count=0, max=w*h;
			if(cc<1){
				out.println("NG");
				System.exit(0);
			}
			while(true){
				if(xx==gx && yy==gy && b[xx][yy]==cc){
					out.println("OK");
					break;
				}
				count++;
				if(count>=max){
					out.println("NG");
					break;
				}
				//b[xx][yy]=6;
				boolean flag=false;
				for(int i=0; i<4; i++){
					if(b[xx+vx[i]][yy+vy[i]]==cc){
						xx+=vx[i];	yy+=vy[i];	v=i;
						flag=true;
						out.println("X"+xx+" Y"+yy);
						break;
					}
				}
				if(flag)	continue;
				xx-=vx[v];	yy-=vy[v];
				for(int i=0; i<4; i++){
					if(b[xx+vx[i]][yy+vy[i]]==cc){
						xx+=vx[i];	yy+=vy[i];	v=i;
						flag=true;
						break;
					}
				}
				if(flag)	continue;
				out.println("END : X"+xx+" Y"+yy);
				out.println("NG");
				break;
			}
			//debug
			de0207(b,w,h);
		}
	}
	void de0207(int[][] b, int w, int h){
		for(int j=0; j<=h; j++){
			for(int i=0; i<=w; i++)	out.print(b[i][j]+" ");
			out.println();
		}
		for(int i=0; i<=w; i++)	out.print("-");
		out.println();
	}
	
	void AOJ0139(){
		int N=sc.nextInt();
		final Pattern ap=Pattern.compile("^>'(=+)#(=+)~$");
		for(int i=1; i<=N; i++){
			String s=sc.next();
			Matcher m=ap.matcher(s);
			if(m.matches()){
				if(m.group(1).length()==m.group(2).length()){
					out.println("A");
					continue;
				}
			}else if(Pattern.compile("^>\\^(Q=)+~~$").matcher(s).matches()){
				out.println("B");
				continue;
			}
			out.println("NA");
		}
	}
	
	ArrayList<Integer> Sieve2(int N){
		ArrayList<Integer> prime = new ArrayList<Integer>();
		boolean[] list = new boolean[N+1];
		Arrays.fill(list, true);
		list[1]=false;
		for (int i=2; i<=N; i++) {
			if(list[i]) {
				prime.add(i);
				for (int j=i+i; j<=N; j+=i)	list[j] = false;
			}
		}
		return prime;
	}

	boolean[] Sieve(int N){
		boolean[] list = new boolean[N+1];
		Arrays.fill(list, true);
		list[0]=false;	list[1]=false;
		for(int j=4; j<=N; j+=2)	list[j]=false;
		for(int i=3; i*i<=N; i+=2) {
			if(list[i]) {
				for (int j=i+i; j<=N; j+=i)	list[j] = false;
			}
		}
		return list;
	}
	
	boolean isPrime(int n){
		for(int i=2; i*i<=n; i++){
			if(n%i==0)     return false;
		}
		return true;
	}
	
	int gcd(int x, int y){
		if(y==0)	return x;
		else	return gcd(y, x%y);
	}
}