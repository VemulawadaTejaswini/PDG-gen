import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	static final int INF=1<<28;
	static final double EPS=1e-9;

	int n, s;
	int[][] sum;

	void run(){
		n=10;
		s=330;
		init();
		for(; sc.hasNext();){
			n=sc.nextInt();
			s=sc.nextInt();
			if(n<=10&&s<=330){
				println(sum[n-1][s]+"");
			}else{
				println("0");
			}
		}
		sc.close();
	}

	void init(){
		int[][] dp=new int[s+1][1<<10];
		int[][] dp2=new int[s+1][1<<10];
		sum=new int[n][s+1];
		dp[0][0]=1;

		for(int j=0; j<n; j++){
			for(int i=0; i<=s; i++){
				System.arraycopy(dp[i], 0, dp2[i], 0, 1<<10);
				Arrays.fill(dp[i], 0);
			}
			for(int i=0; i<10; i++){
				int d=(j+1)*i;
				for(int b=0; b<1<<10; b++){
					if(((1<<i)&b)==0){
						for(int k=0; k+d<=s; k++){
							dp[k+d][(1<<i)|b]+=dp2[k][b];
						}
					}
				}
			}
			for(int i=0; i<=s; i++){
				for(int b=0; b<1<<10; b++){
					sum[j][i]+=dp[i][b];
				}
			}
		}
	}

	int rec(int sum, int flag, int k){
		if(sum>s){
			return 0;
		}
		if(k==n){
			if(sum==s){
				return 1;
			}else{
				return 0;
			}
		}
		int ret=0;
		for(int i=0; i<10; i++){
			if(((1<<i)&flag)==0){
				ret+=rec(sum+(k+1)*i, (1<<i)|flag, k+1);
			}
		}
		return ret;
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