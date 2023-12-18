import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int caze, t, n=5;
	int[][][] a;
	boolean[] birth, survive;

	void run(){
		for(caze=1;; caze++){
			t=sc.nextInt();
			if(t==0){
				break;
			}
			a=new int[n][n][n];
			for(int k=0; k<n; k++){
				for(int j=0; j<n; j++){
					String s=sc.next();
					for(int i=0; i<n; i++){
						a[k][j][i]=s.charAt(i)-'0';
					}
				}
			}
			birth=new boolean[27];
			survive=new boolean[27];
			int m1=sc.nextInt();
			for(int i=0; i<m1; i++){
				birth[sc.nextInt()]=true;
			}
			int m2=sc.nextInt();
			for(int i=0; i<m2; i++){
				survive[sc.nextInt()]=true;
			}
			solve();
		}
	}

	void solve(){
		for(; t>0; t--){
			int[][][] b=new int[n][n][n];
			for(int z=0; z<n; z++){
				for(int y=0; y<n; y++){
					for(int x=0; x<n; x++){
						int live=0;
						for(int k=-1; k<=1; k++){
							for(int j=-1; j<=1; j++){
								for(int i=-1; i<=1; i++){
									if(i==0&&j==0&&k==0){
										continue;
									}
									if(ok(x+i)&&ok(y+j)&&ok(z+k)){
										live+=a[z+k][y+j][x+i];
									}
								}
							}
						}
						if(a[z][y][x]==0&&birth[live]){
							b[z][y][x]=1;
						}
						if(a[z][y][x]==1&&survive[live]){
							b[z][y][x]=1;
						}
					}
				}
			}
			for(int z=0; z<n; z++){
				for(int y=0; y<n; y++){
					for(int x=0; x<n; x++){
						a[z][y][x]=b[z][y][x];
					}
				}
			}
		}
		if(caze>1){
			println("");
		}
		println("Case "+caze+":");
		for(int z=0; z<n; z++){
			for(int y=0; y<n; y++){
				for(int x=0; x<n; x++){
					print(a[z][y][x]+"");
				}
				println("");
			}
			if(z<n-1){
				println("");
			}
		}
	}

	boolean ok(int x){
		return x>=0&&x<n;
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