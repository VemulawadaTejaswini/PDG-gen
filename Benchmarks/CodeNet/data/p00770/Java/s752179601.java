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

	int m, start;

	void run(){
		for(;;){
			m=sc.nextInt();
			start=sc.nextInt();
			if((m|start)==0){
				break;
			}
			solve();
		}
	}

	int[] isPrime;

	void solve(){
		int M=(int)1e6+100;
		if(isPrime==null){
			isPrime=new int[M];
			fill(isPrime, 1);
			isPrime[0]=isPrime[1]=0;
			for(int j=0; j<M; j++){
				if(isPrime[j]==0){
					continue;
				}
				for(int i=j*2; i<M; i+=j){
					isPrime[i]=0;
				}
			}
		}
		int n=2000;
		int[][] dp=new int[n][n];
		int[][] index=new int[n][n];
		for(int i=0; i<n; i++){
			fill(dp[i], -1);
		}
		int[] _=spiralN2XY(start);
		int x0=_[0]-n/2, y0=_[1];
		dp[0][n/2]=isPrime[start];
		index[0][n/2]=start*isPrime[start];
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				if(dp[j][i]<0){
					continue;
				}
				for(int k=-1; k<=1; k++){
					if(j+1>=n||i+k<0||i+k>=n){
						continue;
					}
					int val=spiralXY2N(x0+i+k, y0+j+1);
					// debug(val, x0+i+k, y0+j+1);
					if(val>m){
						continue;
					}
					if(dp[j][i]+isPrime[val]>dp[j+1][i+k]){
						dp[j+1][i+k]=dp[j][i]+isPrime[val];
						// index[j+1][i+k]=val;
						index[j+1][i+k]=isPrime[val]==1?val:index[j][i];
						// index[j+1][i+k]=max(index[j][i], val*isPrime[val]);
					}
				}
			}
			// left--;
			// right++;
			// debug(dp[j]);
		}
		for(int j=0; j<n; j++){
			// debug(index[j]);
		}
		int maxVal=0, maxIndex=0;
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				if(dp[j][i]>maxVal||(dp[j][i]==maxVal&&index[j][i]>maxIndex)){
					maxVal=dp[j][i];
					maxIndex=index[j][i];
				}
			}
		}
		println(maxVal+" "+maxIndex);
	}

	int[] spiralN2XY(int n){
		int m=(int)sqrt(n-1)+1; // n<=m^2 NOTE: in the case of long...?
		int x=m/2-min(m*m-n, m-1), y=m/2-max(m*m-m+1-n, 0);
		if(m%2==0){
			x=-x+1;
			y=-y;
		}
		return new int[]{x, y};
	}

	int spiralXY2N(int x, int y){
		int d=max(abs(x), abs(y));
		if(y>=x)
			return (2*d+1)*(2*d+1)-abs(d-x)-abs(d-y);
		else
			return (2*d)*(2*d)-abs(-d+1-x)-abs(-d-y);
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