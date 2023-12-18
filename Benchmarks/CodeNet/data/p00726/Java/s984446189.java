import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1145();
	}
	
	class AOJ1145{
		final String[] ps={
				"(\\d+)(\\()",		// テヲツ閉ーテ・ツュツ?テゥツ鳴凝ヲツ仰ャテ・ツシツァ
				"(\\d+)([A-Z])",	// テヲツ閉ーテ・ツュツ?テヲツ鳴?・ツュツ?
				"(\\))(\\d+)",		// テゥツ鳴嘉ヲツ仰ャテ・ツシツァ+テヲツ閉ーテ・ツュツ?
				"(\\))([A-Z])",		// テゥツ鳴嘉ヲツ仰ャテ・ツシツァ+テヲツ鳴?・ツュツ?
				"([A-Z])([A-Z])",	// テヲツ鳴?・ツュツ?テヲツ鳴?・ツュツ?
				"([A-Z])(\\d+)"};	// テヲツ鳴?・ツュツ?テヲツ閉ーテ・ツュツ?
		Pattern[] pp;
		AOJ1145(){
			pp=new Pattern[ps.length];
			for(int i=0; i<ps.length; ++i)	pp[i]=Pattern.compile(ps[i]);
			while(sc.hasNext()){
				String s=sc.next();
				int n=sc.nextInt();
				if(s.equals("0"))	break;
				solve(s,n);
			}
		}
		void solve(String s,int n){
			Matcher m=null;
			for(int i=0; i<6; ++i){
				m=pp[i].matcher(s);
				while(m.find()){
					s=s.replaceFirst(ps[i], m.group(1)+ (i>=2? "+": "*") +m.group(2));
					m=pp[i].matcher(s);
				}
			}
//			System.out.println("<"+s);
			Parser parse=new Parser(s+"#",n);
			String ret=parse.start();
//			System.out.println(">"+ret+"#");
			System.out.println( (ret.length()<=n? "0": ret.charAt(n)) );
		}
		class Parser{
			int pos=0,N;
			char[] str;
			Parser(String s,int n){
				this.str=s.toCharArray();
				this.N=n;
			}
			String start(){
				return f1();
			}
			private String f1(){
				String ret=f2();
				while(true){
					if(ret.length()>N)	break;
					char op=str[pos];
//					System.out.println("f1op:"+op);
					if(op=='+'){
						++pos;
						String tmp=f2();
//						System.out.println("tmp:"+tmp);	
						ret+=tmp;
					}else{
						break;
					}
				}
//				System.out.println("f1:"+ret+" "+pos);
				return ret;
			}
			private String f2(){
				String ret=f3();
				while(true){
					char op=str[pos];
//					System.out.println("f2op:"+op);
					if(op=='*'){
						++pos;
//						System.out.println("f2n:"+ret);
						int n=Integer.parseInt(ret);
						ret=f3();
						StringBuilder tmp=new StringBuilder();
						for(int i=0; i<n; ++i){
							tmp.append(ret);
							if(tmp.length()>N)	break;
						}
						ret=tmp.toString();
					}else{
						break;
					}
				}
//				System.out.println("f2:"+ret+" "+pos);
				return ret;
			}
			private String f3(){
				String ret=new String();
				if(Character.isDigit(str[pos])){
					StringBuilder tmp=new StringBuilder();
					tmp.append(str[pos++]);
					while(Character.isDigit(str[pos]))	tmp.append(str[pos++]);
					ret=tmp.toString();
				}else if(str[pos]=='('){
					++pos;
					ret=f1();
					++pos;	// ")"テ」ツ?ョテ・ツ按?
				}else if(Character.isUpperCase(str[pos])){
					ret=""+str[pos++];
//					System.out.println("f3up:"+ret+" p:"+pos);
				}
//				System.out.println("f3:"+ret+" "+pos);
				return ret;
			}
		}
	}
	
	class AOJ1141{
		boolean[] isNotPrime;
		AOJ1141(){
			isNotPrime=sieve(1000000);
			while(sc.hasNext()){
				int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
				if((a|(d|n))==0)	break;
				solve(a,d,n);
			}
		}
		void solve(int a,int d,int n){
			int cnt=0;
			for(int i=a; i<=1000000; i+=d){
				if(!isNotPrime[i])	++cnt;
				if(cnt==n){
					System.out.println(i);
					break;
				}
				
			}
		}
		boolean[] sieve(int MAX){
			boolean[] isNotPrime=new boolean[MAX+1];
			isNotPrime[1]=true;
			for(int i=2; i*i<=MAX; ++i){
				if(!isNotPrime[i])for(int j=i+i; j<=MAX; j+=i)	isNotPrime[j]=true;
			}
			return isNotPrime;
		}
	}
	
	class AOJ1142{
		AOJ1142(){
			int n=sc.nextInt();
			while(--n>=0)	solve();
		}
		void solve(){
			StringBuilder line=new StringBuilder(sc.next());
			HashSet<String> set=new HashSet<String>();
			set.add(line.toString());
			for(int i=1; i<=line.length(); ++i){
				String s1=line.substring(0, i),
						s2=line.substring(i, line.length());
				String s1r=new StringBuilder(s1).reverse().toString(),
						s2r=new StringBuilder(s2).reverse().toString();
				set.add(s1+s2r);
				set.add(s1r+s2);
				set.add(s1r+s2r);
				set.add(s2+s1);
				set.add(s2+s1r);
				set.add(s2r+s1);
				set.add(s2r+s1r);
			}
//			System.out.println(set);
			System.out.println(set.size());
		}
	}
	
	class AOJ1144{
		AOJ1144(){
			while(sc.hasNext()){
				w=sc.nextInt();
				h=sc.nextInt();
				if((w|h)==0)	break;
				solve(w,h);
			}
		}
		final int INF=Integer.MAX_VALUE/4;
		final int[] vx={0,1,0,-1},vy={-1,0,1,0};
		int w,h;
		int sx,sy,ex,ey;
		void solve(int w,int h){
			boolean[][] b=new boolean[w][h];
			sx=0;	sy=0;	ex=0;	ey=0;
			for(int y=0; y<h; ++y)for(int x=0; x<w; ++x){
				int tmp=sc.nextInt();
				b[x][y]=(tmp!=1);
				if(tmp==2){
					sx=x;	sy=y;
				}else if(tmp==3){
					ex=x;	ey=y;
				}
			}
			
			int ans=-1;
			for(int cnt=0; cnt<=10; ++cnt){
				boolean[][] bc=new boolean[w][h];
				for(int x=0; x<w; ++x)for(int y=0; y<h; ++y)	bc[x][y]=b[x][y];
				int ret=DFS(sx,sy,0,cnt,bc);
				if(ret<INF){
					ans=ret;
					break;
				}
			}
			System.out.println(ans);
		}
		int DFS(int x,int y,int depth,int limit,boolean[][] b){
//			System.out.println(x+" "+y+" "+depth+" "+limit);
			if(depth>=limit)	return INF;
			if(x==ex&&y==ey)	return depth;
			
			int ret=INF;
			for(int v=0; v<4; ++v){
				int xx=x+vx[v],yy=y+vy[v];
				if(!(0<=xx&&xx<w && 0<=yy&&yy<h))	continue;
				if(!b[xx][yy])	continue;
				if(xx==ex&&yy==ey){
					ret=min(ret,depth+1);
					continue;
				}
				while(true){
					xx+=vx[v];
					yy+=vy[v];
					if(!(0<=xx&&xx<w && 0<=yy&&yy<h))	break;
					if(xx==ex&&yy==ey){
						ret=min(ret,depth+1);
						break;
					}
					if(!b[xx][yy]){
						xx-=vx[v];
						yy-=vy[v];
						b[xx+vx[v]][yy+vy[v]]=true;
						ret=min(ret, DFS(xx,yy,depth+1,limit,b));
						b[xx+vx[v]][yy+vy[v]]=false;
						break;
					}
				}
			}
			return ret;
			
		}
	}

}