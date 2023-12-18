import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			int na, nb, nc;
			na=sc.nextInt();
			nb=sc.nextInt();
			nc=sc.nextInt();
			if((na|nb|nc)==0){
				break;
			}

			int n=sc.nextInt();
			int[] as=new int[na];
			int[] bs=new int[nb];
			int[] cs=new int[nc];
			Arrays.fill(as, 2);
			Arrays.fill(bs, 2);
			Arrays.fill(cs, 2);

			R[] rs=new R[n];
			for(int i=0; i<n; i++){
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-na-1;
				int c=sc.nextInt()-na-nb-1;
				int r=sc.nextInt();
				rs[i]=new R(a, b, c, r);
				if(r==1){
					as[a]=1;
					bs[b]=1;
					cs[c]=1;
				}
			}

			for(int i=0; i<n; i++){
				if(rs[i].r==0){
					int a=as[rs[i].a];
					int b=bs[rs[i].b];
					int c=cs[rs[i].c];
					if(a==1&&b==1){
						c=0;
					}else if(b==1&&c==1){
						a=0;
					}else if(c==1&&a==1){
						b=0;
					}
					as[rs[i].a]=a;
					bs[rs[i].b]=b;
					cs[rs[i].c]=c;
				}
			}
			for(int i=0; i<na; i++){
				println(as[i]+"");
			}
			for(int i=0; i<nb; i++){
				println(bs[i]+"");
			}
			for(int i=0; i<nc; i++){
				println(cs[i]+"");
			}
		}
	}

	class R{
		int a, b, c, r;

		R(int a, int b, int c, int r){
			this.a=a;
			this.b=b;
			this.c=c;
			this.r=r;
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