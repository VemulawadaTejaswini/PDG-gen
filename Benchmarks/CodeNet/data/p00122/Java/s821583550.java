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

	int x, y;
	int n;
	int[] xs, ys;

	// JG
	int[] dx={-1, 0, 1, -1, 0, 1, -2, -2, -2, 2, 2, 2};
	int[] dy={-2, -2, -2, 2, 2, 2, -1, 0, 1, -1, 0, 1};

	void run(){
		for(;;){
			x=sc.nextInt();
			y=sc.nextInt();
			if((x|y)==0){
				break;
			}
			n=sc.nextInt();
			xs=new int[n];
			ys=new int[n];
			for(int i=0; i<n; i++){
				xs[i]=sc.nextInt();
				ys[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		boolean f=false;
		for(int i=0; i<dx.length; i++){
			f|=dfs(x+dx[i], y+dy[i], 0);
		}
		println(f?"OK":"NA");
	}

	// ¿å¤ÇkÌXvN[ÉÀÁ½Cª·é
	boolean dfs(int x, int y, int k){
		if(k==n){
			return true;
		}
		if(x<0||x>=10||y<0||y>=10){
			return false;
		}
		if(x<xs[k]-1||x>xs[k]+1||y<ys[k]-1||y>ys[k]+1){
			return false;
		}
		boolean f=false;
		for(int i=0; i<dx.length; i++){
			f|=dfs(x+dx[i], y+dy[i], k+1);
		}
		return f;
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