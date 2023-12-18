import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ0157();
	}
	
	// TLE
	// steps 37 - 43 - 51
	void AOJ0157(){
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0)	break;
			ArrayList<C0157> m=new ArrayList<C0157>();
			for(int i=0; i<N; i++)	m.add(new C0157(sc.nextInt(),sc.nextInt()));
			int M=sc.nextInt();
			for(int i=0; i<M; i++)	m.add(new C0157(sc.nextInt(),sc.nextInt()));
			Collections.sort(m);
			int ans=solve0157(m,m.get(m.size()-1),1);	C0157 last=m.get(m.size()-1);
			/*
			for(int i=N+M-2; i>=0; i--){
				C0157 now=m.get(i);
				if(now.h<=last.h && now.r<=last.r)	break;
				m.remove(i);
				ans=max(ans,solve0157(m,now,1));
				m.add(i,now);
			}*/
			out.println(ans);
			//out.println(cc+"steps");
		}
	}
	int cc=0;
	int solve0157(ArrayList<C0157> M,C0157 now,int c){
		cc++;
		int ans=c;
		ArrayList<C0157> m=new ArrayList<C0157>(M);
		C0157 last=null;
		for(int i=m.size()-1; i>=0; i--){
			C0157 temp=m.get(i);
			m.remove(i);
			if(now.r>temp.r && now.h>temp.h){
				if(last!=null){
					if(last.r>temp.r && last.h>temp.h)	continue;
				}
				ans=max(ans,solve0157(m,temp,c+1));
				//m.add(i, temp);
				last=temp;
			}
		}
		return ans;
	}
	class C0157 implements Comparable<C0157>{
		int r,h;
		C0157(int h,int r){	this.r=r;	this.h=h;}
		@Override public int compareTo(C0157 o){
			if(this.r<o.r)	return -1;
			if(this.r>o.r)	return 1;
			if(this.h<o.h)	return -1;
			if(this.h>o.h)	return 1;
			return 0;
		}
	}
	
	// 途中
	void AOJ0170(){
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0)	break;
			C0170[] f=new C0170[N];
			for(int i=0; i<N; i++)	f[i]=new C0170(sc.next(),sc.nextInt(),sc.nextInt());
			Arrays.sort(f);
			int[] ss=new int[N];
			
			for(int i=0; i<N; i++)	ss[i]=f[i].w+(i>0?ss[i-1]:0);
			for(int i=0; i<N; i++){
				if(f[i].s<ss[i]);
			}
		}
	}
	class C0170 implements Comparable<C0170>{
		String name;	int w,s;
		C0170(String n,int w,int s){	this.name=n;	this.w=w;	this.s=s;}
		@Override public int compareTo(C0170 o){
			if(this.w<o.w)	return -1;
			if(this.w>o.w)	return 1;
			return 0;
		}
	}
	
	void AOJ0169(){
		while(sc.hasNext()){
			String[] s=sc.nextLine().split(" ");
			if(s[0].equals("0"))	break;
			int ans=0,c=0;
			for(String i:s){
				c+=(i.equals("1")?1:0);
				ans+=solve0169(i);
			}
			while(--c>=0){
				if(ans+10>21)	break;
				ans+=10;
			}
			out.println((ans<=21?ans:0));
		}
	}
	int solve0169(String s){
		int r=Integer.parseInt(s);
		if(r>=10)	return 10;
		return r;
	}
}