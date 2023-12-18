import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{

	Scanner sc=new Scanner(System.in);;

	int INF=1<<28;
	double EPS=1e-9;

	int[] dx={0, 1, 0, -1};
	int[] dy={-1, 0, 1, 0};

	// ----
	boolean[][] w1=new boolean[5][4];
	// |||||
	boolean[][] w2=new boolean[4][5];

	void run(){
		for(int i=0; i<9; i++){
			boolean[] w;
			if(i%2==0)
				w=w1[i/2];
			else
				w=w2[i/2];
			String s=sc.nextLine();
			for(int k=0; k<s.length(); k++){
				w[k]=s.charAt(k)=='1';
			}
		}
		solve();
	}

	void solve(){
		int x=0, y=0;
		int d=1;
		for(;;){
			for(d=(d+3)%4;; d=(d+1)%4){
				if(d==0&&up(x, y)){
					print("U");
					break;
				}else if(d==1&&right(x, y)){
					print("R");
					break;
				}else if(d==2&&down(x, y)){
					print("D");
					break;
				}else if(d==3&&left(x, y)){
					print("L");
					break;
				}
			}
			x+=dx[d];
			y+=dy[d];
			if((x|y)==0){
				break;
			}
		}
	}

	boolean up(int x, int y){
		return y>0&&w2[y-1][x];
	}

	boolean down(int x, int y){
		return y<4&&w2[y][x];
	}

	boolean left(int x, int y){
		return x>0&&w1[y][x-1];
	}

	boolean right(int x, int y){
		return x<4&&w1[y][x];
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
		new Main().run();
	}
}