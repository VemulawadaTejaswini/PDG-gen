import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	int n;
	int[] m;
	int[][] xs,ys;
	
	void run() {
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			m=new int[n+1];
			xs=new int[n+1][];
			ys=new int[n+1][];
			for(int j=0;j<=n;j++){
				m[j]=sc.nextInt();
				xs[j]=new int[m[j]];
				ys[j]=new int[m[j]];
				for(int i=0;i<m[j];i++){
					xs[j][i]=sc.nextInt();
					ys[j][i]=sc.nextInt();
				}
			}
			solve();
		}
	}

	void solve() {
		for(int i=1;i<=n;i++){
			//debug("i",i);
			if(m[0]==m[i]&&match(m[0],xs[0],ys[0],xs[i],ys[i])){
				println(i+"");
			}
		}
		println("+++++");
	}

	boolean match(int m,int[]xs1,int[]ys1,int[]xs2,int[]ys2){
		// vx,0
		// vx,0
		// -vx,0
		// 0,vx
		// 0,-vx
		
		int[][][]a={
				{
					{1,0},
					{0,1}
				},
				{
					{0,-1},
					{1,0}
				},
				{
					{-1,0},
					{0,-1}
				},
				{
					{0,1},
					{-1,0}
				}
		};
		
		int k1=-1,k2=-1;
		
		for(int j=0;j<4;j++){
			int vx1=xs1[1]-xs1[0];
			int vy1=ys1[1]-ys1[0];
			int vx2=xs2[1]-xs2[0];
			int vy2=ys2[1]-ys2[0];
			if(vx1*a[j][0][0]+vy1*a[j][0][1]==vx2&&
					vx1*a[j][1][0]+vy1*a[j][1][1]==vy2){
				k1=j;
			}
			int vx3=xs2[m-2]-xs2[m-1];
			int vy3=ys2[m-2]-ys2[m-1];
			if(vx1*a[j][0][0]+vy1*a[j][0][1]==vx3&&
					vx1*a[j][1][0]+vy1*a[j][1][1]==vy3){
				k2=j;
			}
		}
		
		//debug(k1,k2);
		
		if(k1==-1&&k2==-1){
			return false;
		}
		
		boolean f1=k1!=-1,f2=k2!=-1;
		
		for(int i=0;i<m-1;i++){
			int vx1=xs1[i+1]-xs1[i];
			int vy1=ys1[i+1]-ys1[i];
			int vx2=xs2[i+1]-xs2[i];
			int vy2=ys2[i+1]-ys2[i];
			int vx3=xs2[m-i-2]-xs2[m-i-1];
			int vy3=ys2[m-i-2]-ys2[m-i-1];
			if(k1!=-1){
				f1&=vx1*a[k1][0][0]+vy1*a[k1][0][1]==vx2&&
				vx1*a[k1][1][0]+vy1*a[k1][1][1]==vy2;
			}
			if(k2!=-1){
				f2&=vx1*a[k2][0][0]+vy1*a[k2][0][1]==vx3&&
				vx1*a[k2][1][0]+vy1*a[k2][1][1]==vy3;
			}
		}
		
		return f1||f2;
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}