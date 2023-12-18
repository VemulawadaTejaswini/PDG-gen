import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int T;
	int n=5;
	int[][] a;

	void run(){
		T=sc.nextInt();
		for(int k=0; k<T; k++){
			a=new int[n][n];
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					a[j][i]=sc.nextInt();
				}
			}
			solve();
		}
	}

	void solve(){
		int max=0;
		for(int y=0; y<n; y++){
			for(int x=0; x<n; x++){
				for(int w=1; w<=n; w++){
					for(int h=1; h<=n; h++){
						// [x, x+w)*[y, y+h)
						boolean ok=true;
						for(int j=y; j<y+h; j++){
							if(j>=n){
								ok=false;
								break;
							}
							for(int i=x; i<x+w; i++){
								if(i>=n){
									ok=false;
									break;
								}
								ok&=a[j][i]==1;
							}
						}
						if(ok){
							max=max(max, w*h);
						}
					}
				}
			}
		}
		println(max+"");
	}

	void debug(Object... os){
		System.err.println(deepToString(os));
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