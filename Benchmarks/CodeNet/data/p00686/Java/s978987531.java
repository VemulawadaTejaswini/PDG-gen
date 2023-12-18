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

	int m,n;
	int[] dx={0,1,0,-1};
	int[] dy={1,0,-1,0};
	
	void run() {
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			int x=1,y=1;
			boolean collision=false;
			int k=0;
			for(;;){
				String s=sc.next();
				if(s.equals("STOP")){
					break;
				}
				if(collision){
					continue;
				}
				if(s.equals("FORWARD")){
					int d=sc.nextInt();
					x+=dx[k]*d;
					y+=dy[k]*d;
				}else if(s.equals("BACKWARD")){
					int d=sc.nextInt();
					x-=dx[k]*d;
					y-=dy[k]*d;
				}else if(s.equals("RIGHT")){
					k=(k+1)%4;
				}else if(s.equals("LEFT")){
					k=(k+3)%4;
				} 
				if(x<1){
					x=1;
					collision=true;
				}else if(x>m){
					x=m;
					collision=true;
				}
				if(y<1){
					y=1;
					collision=true;
				}else if(y>n){
					y=n;
					collision=true;
				}
			}
			println(x+" "+y);
		}
	}

	void solve() {
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