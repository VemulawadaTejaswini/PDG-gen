
import java.util.*;
import java.awt.*;
import java.awt.geom.*;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Main {
	final Scanner sc=new Scanner(System.in);
	final int INF=1<<24;
	double EPS = 1.0e-08;
	final int[] vx={0,1,0,-1},vy={1,0,-1,0};
	public static void main(String[] args) {
		new Main().B();
	}
	
	void A(){
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			ArrayList<TreeSet<Integer>> data = new ArrayList<TreeSet<Integer>>();
			for(int i =0; i < n; i++){
				data.add(new TreeSet<Integer>());
				int m = sc.nextInt();
				for(int j = 0 ; j < m; j++){
					data.get(i).add(sc.nextInt());
				}
			}
			TreeSet<Integer> data2 = new TreeSet<Integer>();
			int m = sc.nextInt();
			for(int i=0; i < m; i++){
				data2.add(sc.nextInt());
			}
			//boolean flg2 = false;
			int ind = -1;
			for(int i=0; i < n; i++){
				boolean flg = true;
				for(int result: data2){
					if(! data.get(i).contains(result)){
						flg = false;
						break;
					}
				}
				if(flg){
					if(ind == -1){
						ind = i + 1;
					}
					else{
						//flg2 = true;
						ind = -1;
						break;
					}
				}
			}
			System.out.println(ind);
			
		}
	}
	
	
	int BT,BP,BR;
	void B(){
		while(sc.hasNext()){
			BT=sc.nextInt();	BP=sc.nextInt();	BR=sc.nextInt();
			if(BT==0)	break;
			ClassB[] rec=new ClassB[BT];
			for(int i=0; i<BT; i++){
				rec[i]=new ClassB(i);
			}
			for(int i=0; i<BR; i++){
				int t=sc.nextInt()-1,p=sc.nextInt()-1,time=sc.nextInt();
				String mes=sc.next();
				if(mes.equals("CORRECT")){
					rec[t].num++;
					rec[t].time+=time+(rec[t].p[p]*1200);
				}else if(mes.equals("WRONG")){
					rec[t].p[p]++;
				}
			}
			Arrays.sort(rec);
			for(ClassB i:rec)	out.println((i.team+1)+" "+i.num+" "+i.time);
		}
		
	}
	class ClassB implements Comparable<ClassB>{
		int team,num,time;
		int[] p=new int[BP];
		ClassB(int t){this.team=t;}
		@Override public int compareTo(ClassB o) {
			if(this.num<o.num)	return 1;
			if(this.num>o.num)	return -1;
			if(this.time<o.time)	return -1;
			if(this.time>o.time)	return 1;
			if(this.team<o.team)	return -1;
			if(this.team>o.team)	return 1;
			return 0;
		}
	}
	
	public class parsed{
		String line;
		int pos=0;
		boolean ans;
		parsed(String line){
			this.line=line;
			//ans=expr();
			ans=term();
		}
		private boolean expr(){
			boolean res=term();
			while(true){
				char op=line.charAt(pos);
				if(op=='-' && line.charAt(pos+1)!='>'){
					res=!term();
					pos++;
				}else	break;
			}
			return res;
		}
		private boolean term(){
			boolean res=fact();
			while(true){
				char op=line.charAt(pos);
				if(op=='*'||op=='+'){
					boolean old=res;
					pos++;
					res=fact();
					switch(op){
					case '*':	res=old&&res;	break;
					case '+':	res=old||res;	break;
					}
				}else if(op=='-' && line.charAt(pos+1)=='>'){
					boolean old=res;
					pos+=2;
					res=fact();
					res= !old?true:res?true:false;
				//}else if(op=='-'){
					
				}else	break;
			}
			return res;
		}
		private boolean fact(){
			//boolean flag=false;
			if(line.charAt(pos)=='-' && line.charAt(pos+1)!='>'){
				pos++;
				return !fact();
				//flag=true;
			}
			if(line.charAt(pos)=='T'){
				pos++;
				return true;
			}
			else if(line.charAt(pos)=='F'){
				pos++;
				return false;
			}
			else if(line.charAt(pos)=='('){
				pos++;
				//boolean res=expr();
				boolean res=term();
				pos++;
				return res;
			}
			return false;
		}
		public boolean res(){return ans;}
	}
	
	void C(){
		while(sc.hasNext()){
			String str=sc.next();
			if(str.equals("#"))	break;
			str=str.replaceAll("--", "");
			int idx=str.indexOf("=");
			String l=str.substring(0, idx),r=str.substring(idx+1);
			char[] temp=str.replaceAll("[+-=*>()TF]", "").toCharArray();
			HashSet<Character> set=new HashSet<Character>();
			for(char c:temp)	set.add(c);
			
			char[] list=new char[set.size()];
			Iterator<Character> it=set.iterator();
			int ii=0;
			while(it.hasNext())	list[ii++]=it.next();
			//out.println(Arrays.toString(list));
			//out.println(set);
			//out.println(1<<(set.size()));
			boolean flag=true;
			for(int i=0; i<(1<<(set.size())); i++){
				String ll=l,rr=r;
				for(int j=0; j<set.size(); j++){
					if( (i&(1<<j)) >0){
						//out.println((i&(1<<j))+" J"+j+" I"+i);
						ll=ll.replaceAll(""+list[j], "T");
						ll=ll.replaceAll("-T", "F");
						ll=ll.replaceAll("-F", "T");
						rr=rr.replaceAll(""+list[j], "T");
						rr=rr.replaceAll("-T", "F");
						rr=rr.replaceAll("-F", "T");
					}else{
						ll=ll.replaceAll(""+list[j], "F");
						ll=ll.replaceAll("-T", "F");
						ll=ll.replaceAll("-F", "T");
						rr=rr.replaceAll(""+list[j], "F");
						rr=rr.replaceAll("-T", "F");
						rr=rr.replaceAll("-F", "T");
					}
				}
				//out.println(ll+"="+new parsed(ll+"#").res()+" "+rr+"="+new parsed(rr+"#").res());
				if(new parsed(ll+"#").res() != new parsed(rr+"#").res()){
					out.println("NO");
					flag=false;
					break;
				}
			}
			if(flag)	out.println("YES");
		}
	}
	boolean solveC(String l,String r){
		return false;
	}
	
	double getD1(Line2D a, Line2D b){
		Point2D a1 = a.getP1();
		Point2D a2 = a.getP2();
		Point2D b1 = b.getP1();
		Point2D b2 = b.getP2();
		double res = INF;
		res = min(res, getD(a1,a2, b1));
		res = min(res, getD(a1,a2, b2));
		res = min(res, getD(b1,b2, a1));
		res = min(res, getD(b1,b2, a2));
		return res;
	}
	
	private double getD(Point2D a, Point2D b, Point2D c) {
		Point2D ba = getV(b, a);
		Point2D ca = getV(c, a);
		Point2D ab = getV(a, b);
		Point2D cb = getV(c, b);
		double result;
		if(getDot(ba,ca) < EPS){
			result = a.distance(c);
		}
		else if(getDot(ab, cb) < EPS){
			result = c.distance(b);
		}
		else{
			result = Math.abs(getCross(ba,ca)) / b.distance(a);
		}
		return result;
	}
	
	Point2D getV(Point2D a, Point2D b){
		Point2D ab = new Point2D.Double(a.getX() - b.getX() , a.getY() - b.getY());
		return ab;
	}
	
	double getDot(Point2D a, Point2D b){
		return (a.getX() * b.getX() + a.getY() * b.getY());
	}
	
	double getCross(Point2D a, Point2D b){
		return (a.getX() * b.getY() - a.getY() * b.getX());
	}

	void D(){
		while(sc.hasNext()){
			int N=sc.nextInt(),M=sc.nextInt()-1,L=sc.nextInt()-1;
			if(N==0)	break;
			Point2D [][] plist = new Point2D.Double[100][5];
			Line2D [][] llist = new Line2D.Double[100][5];
			
			for(int i=0; i<N; i++){
				int x=sc.nextInt(),y=sc.nextInt(),a=sc.nextInt(),r=sc.nextInt();
				for(int j = 0; j < 5; j++){
					double rad = Math.toRadians((a + 72 * j));
					double xx = x +  r * Math.sin(rad);
					double yy = y +  r * Math.cos(rad);
					plist[i][j] = new Point2D.Double(xx, yy);
					//System.out.println( x + " " + y + " " + a + " " + " r=" + r +" xx ,yy = " +plist[i][j].toString());
				}
				
				for(int j = 0 ; j < 5; j++){
					llist[i][j] = new Line2D.Double(plist[i][j] , plist[i][(j+1)%5]);
					//System.out.println(llist[i][j].getP1().toString() + " " + llist[i][j].getP2().toString());
				}
				
				
				// 入力
			}
			double[][] d=new double[N][N];
			for(int i = 0; i < N; i++){
				d[i][i] = 0.0;
				for(int j = i+1; j < N; j++){
					double ans = 1 << 24;
					for(int k = 0 ; k < 5; k++){
						for(int l = 0; l < 5; l++){
							Line2D nowi = llist[i][k];
							Line2D nowj = llist[j][l];
							if(nowi.intersectsLine(nowj)){
								ans =0.0;
								continue;
							}
							double res = getD1(nowi , nowj);
							//System.out.print("res = ");
							//System.out.println(res);
							ans = Math.min(ans, res);
						}
					}
					d[i][j] = ans;
					d[j][i] = ans;
				}
			}
			
			//debug
			System.out.println("debug = ");
			for(int i=0; i < N; i++){
				for(int j=0; j < N; j++){
					System.out.print(d[i][j] +" ");
				}
				System.out.println();
			}
			System.out.println();
			
			for(int j = 0; j < N; j++){
				for(int i =0; i < N; i++){
					for(int k=0; k < N; k++){
						d[i][k] = Math.min(d[i][k], d[i][j] + d[j][k]);
					}
				}
			}
		
			double ans= d[M][L];
			
			out.println(ans);
		}
	}
	class CD{
		int n;	double d;
		CD(int n,double d){this.n=n; this.d=d;}
	}
}