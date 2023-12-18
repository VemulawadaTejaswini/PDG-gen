import java.util.*;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int INF=Integer.MAX_VALUE/4;
	public static void main(String[] args) {
		new Main().doIt();
	}
	void doIt(){
		new AOJ1218();
	}
	
	class AOJ1218{
		final int[] vx={0,1,0,-1},vy={1,0,-1,0};
		int W,H;
		AOJ1218(){
			while(true){
				W=sc.nextInt();	H=sc.nextInt();
				if(W==0 || H==0)	break;
				int sx=-1,sy=-1,gx=-1,gy=-1,cx=-1,cy=-1;
				boolean[][] wall=new boolean[W][H];
				for(int y=0; y<H; y++){
					for(int x=0; x<W; x++){
						switch(sc.nextInt()){
						case 1:	wall[x][y]=true;	break;
						case 2:	cx=x; cy=y; break;
						case 3:	gx=x; gy=y; break;
						case 4:	sx=x; sy=y; break;
						}
					}
				}
				PriorityQueue<Pos> open=new PriorityQueue<Main.AOJ1218.Pos>();
				open.add(new Pos(sx,sy,cx,cy,0));
				int[][][][] closed=new int[W][H][W][H];
				for(int i=0; i<W; i++)for(int j=0; j<H; j++)for(int k=0; k<W; k++)for(int m=0; m<H; m++)closed[i][j][k][m]=INF;
				closed[sx][sy][cx][cy]=0;
				boolean flag=false;
				while(!open.isEmpty()){
					Pos now=open.poll();
					//System.out.println(now);
					for(int i=0; i<4; i++){
						int xx=now.x+vx[i],yy=now.y+vy[i];
						if(!isInRange(xx,yy))	continue;
						if(wall[xx][yy])	continue;
						if(xx==now.cx && yy==now.cy){
							int xxx=xx+vx[i],yyy=yy+vy[i];
							if(!isInRange(xxx,yyy))	continue;
							if(wall[xxx][yyy])	continue;
							if(closed[xx][yy][xxx][yyy]<=now.step+1)	continue;
							if(xxx==gx && yyy==gy){
								System.out.println(now.step+1);
								open.clear();
								flag=true;
								break;
							}
							open.add(new Pos(xx,yy,xxx,yyy,now.step+1));
							closed[xx][yy][xxx][yyy]=now.step+1;
						}else{
							if(closed[xx][yy][now.cx][now.cy]<=now.step)	continue;
							open.add(new Pos(xx,yy,now.cx,now.cy,now.step));
							closed[xx][yy][now.cx][now.cy]=now.step;
						}
					}
				}
				if(!flag)	System.out.println(-1);
			}
		}
		boolean isInRange(int x,int y){
			return 0<=x && x<W && 0<=y && y<H;
		}
		class Pos implements Comparable<Pos>{
			int x,y,cx,cy,step;
			Pos(int x,int y,int cx,int cy,int step){this.x=x; this.y=y; this.cx=cx; this.cy=cy; this.step=step;}
			@Override public int compareTo(Pos o) {
				if(this.step<o.step)	return -1;
				if(this.step>o.step)	return 1;
				return 0;
			}
			@Override public String toString(){return "("+x+","+y+") ("+cx+","+cy+") "+step;}
		}
	}
	
	// 0:55WA 1:20AC
	class AOJ1227{
		ArrayList<ArrayList<String>> dic,dic2ans;
		AOJ1227(){
			String s="22233344455566677778889999";
			char[] dic2=new char[26];
			for(int i=0; i<26; i++)	dic2[i]=s.charAt(i);
			while(true){
				int N=sc.nextInt();
				if(N==0)	break;
				dic=new ArrayList<ArrayList<String>>(10);
				dic2ans=new ArrayList<ArrayList<String>>(10);
				for(int i=0; i<10; i++){
					dic.add(new ArrayList<String>());
					dic2ans.add(new ArrayList<String>());
				}
				for(int i=0; i<N; i++){
					String in=sc.next();
					StringBuilder sb=new StringBuilder(in);
					for(int j=0; j<sb.length(); j++)	sb.setCharAt(j, dic2[sb.charAt(j)-'a']);
					int init=sb.charAt(0)-'0';
					dic.get(init).add(sb.toString());
					dic2ans.get(init).add(in);
				}
				//System.out.println(dic);
				//System.out.println(dic2ans);
				String in=sc.next();
				solve(in, 0, new String());
				System.out.println("--");
			}
		}
		void solve(String in,int idx,String ans){
			if(idx==in.length())	System.out.println(ans+".");
//			else if(idx>in.length()){
//				System.out.println("index out of");
//				System.out.println(idx+" "+ans);
//			}
			else{
				int init=in.charAt(idx)-'0';
				for(int i=0; i<dic.get(init).size(); i++){
					String s=dic.get(init).get(i);
					if(in.startsWith(s, idx))	solve(in, idx+s.length(), ans+(ans.length()==0?dic2ans.get(init).get(i):" "+dic2ans.get(init).get(i)));
				}
			}
		}
	}
	
	// 21:50-22:16 22:32WA
	// ICPC Asia Japan 2001 B
	class AOJ1225{
		AOJ1225(){
			while(true){
				ArrayList<Deal> sell=new ArrayList<Deal>(),buy=new ArrayList<Deal>();
				HashMap<String,Dealer> dealer=new HashMap<String,Dealer>();
				HashMap<String,Commodities> comm=new HashMap<String, Commodities>();
				int N=sc.nextInt();
				if(N==0)	break;
				for(int I=0; I<N; I++){
					String d=sc.next(),ff=sc.next(),c=sc.next();
					int a=sc.nextInt();
					boolean f=ff.equals("BUY");
					if(!dealer.containsKey(d))	dealer.put(d, new Dealer(0, 0));
					ArrayList<Deal> tmp=(f?sell:buy);
					int idx=-1,m=(f?INF:-1);
					for(int i=0; i<tmp.size(); i++){
						if(tmp.get(i).c.equals(c) && !tmp.get(i).d.equals(d) && (f?m>a:m<a) && (f?a>=tmp.get(i).a:a<=tmp.get(i).a)){
							m=a;	idx=i;
						}
					}
					if(idx>=0){
						a=(a+tmp.get(idx).a)/2;
						if(!comm.containsKey(c))	comm.put(c, new Commodities(a));
						else	comm.get(c).add(a);
						dealer.get(d).add(f?0:a, f?a:0);
						dealer.get(tmp.get(idx).d).add(f?a:0, f?0:a);
						tmp.remove(idx);
					}else{
						tmp=(f?buy:sell);
						tmp.add(new Deal(d,c,a));
					}
				}
				ArrayList<String> keys=new ArrayList<String>();
				for(String key:comm.keySet())	keys.add(key);
				Collections.sort(keys);
				for(String key:keys){
					Commodities now=comm.get(key);
					System.out.println(key+" "+now.min+" "+now.getAve()+" "+now.max);
				}
				System.out.println("--");
				keys.clear();
				for(String key:dealer.keySet())	keys.add(key);
				Collections.sort(keys);
				for(String key:keys)	System.out.println(key+" "+dealer.get(key).out+" "+dealer.get(key).in);
				System.out.println("----------");
			}
		}
		class Deal{
			String d,c;	int a;
			Deal(String d,String c,int a){	this.d=d; this.c=c; this.a=a;}
		}
		class Dealer{
			int in,out;
			Dealer(int in,int out){this.in=in; this.out=out;}
			void add(int in,int out){this.in+=in; this.out+=out;}
		}
		class Commodities{
			int max,min,sum,num;
			Commodities(int a){
				this.max=a; this.min=a; this.sum=a;
				this.num=1;
			}
			void add(int a){
				this.max=max(this.max,a);	this.min=min(this.min,a);
				this.sum+=a;	this.num++;
			}
			int getAve(){ return this.sum/this.num;}
		}
	}

}