import java.util.Scanner;

public class Main{
	public static int func(int[] b,int[] r,int[] g,int cnt,int col,int now){
		int a=cnt;
		if(col==0){
			if(b[now]>=3){
				b[now]-=3;
				a=Math.max(a,func(b,r,g,cnt+1,col,now));
				b[now]+=3;
			}
			if(now<=7)if(b[now]>=1 && b[now+1]>=1 && b[now+2]>=1){
				b[now]-=1;
				b[now+1]-=1;
				b[now+2]-=1;
				a=Math.max(a,func(b,r,g,cnt+1,col,now));
				b[now]+=1;
				b[now+1]+=1;
				b[now+2]+=1;
			}
			if(now!=9)a=Math.max(a,func(b,r,g,cnt,col,now+1));
			else a=Math.max(a,func(b,r,g,cnt,col+1,1));
		}
		if(col==1){
			if(r[now]>=3){
				r[now]-=3;
				a=Math.max(a,func(b,r,g,cnt+1,col,now));
				r[now]+=3;
			}
			if(now<=7)if(r[now]>=1 && r[now+1]>=1 && r[now+2]>=1){
				r[now]-=1;
				r[now+1]-=1;
				r[now+2]-=1;
				a=Math.max(a,func(b,r,g,cnt+1,col,now));
				r[now]+=1;
				r[now+1]+=1;
				r[now+2]+=1;
			}
			if(now!=9)a=Math.max(a,func(b,r,g,cnt,col,now+1));
			else a=Math.max(a,func(b,r,g,cnt,col+1,1));
		}
		if(col==2){
			if(g[now]>=3){
				g[now]-=3;
				a=Math.max(a,func(b,r,g,cnt+1,col,now));
				g[now]+=3;
			}
			if(now<=7)if(g[now]>=1 && g[now+1]>=1 && g[now+2]>=1){
				g[now]-=1;
				g[now+1]-=1;
				g[now+2]-=1;
				a=Math.max(a,func(b,r,g,cnt+1,col,now));
				g[now]+=1;
				g[now+1]+=1;
				g[now+2]+=1;
			}
			if(now!=9)a=Math.max(a,func(b,r,g,cnt,col,now+1));
		}
		return a;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] n;
		String[] s;
		n=new int[9];
		s=new String[9];
		for(int ttt=0;ttt<t;ttt++){
			int[] b,r,g;
			b=new int[10];
			r=new int[10];
			g=new int[10];
			for(int i=0;i<9;i++)n[i]=sc.nextInt();
			for(int i=0;i<9;i++){
				s[i]=sc.next();
				if(s[i].equals("B"))b[n[i]]++;
				if(s[i].equals("G"))g[n[i]]++;
				if(s[i].equals("R"))r[n[i]]++;
			}
			System.out.printf("%d\n",func(b,g,r,0,0,0)/3);
		}
	}
}