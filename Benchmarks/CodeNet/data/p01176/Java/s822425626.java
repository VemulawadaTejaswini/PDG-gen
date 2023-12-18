import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Controlled Tournament
public class Main{

	int[] f;
	Set<Integer>[][][] set;
	long[][] dp;
	int[][] r;
	int n, M;
	
	long get(int p, int S){
		if(((S>>p)&1)==0)return dp[p][S] = 0;
		if(dp[p][S]!=-1)return dp[p][S];
		int N = Integer.bitCount(S);
		if(N==1)return dp[p][S] = 1;
		long res = 0;
		for(int F=0;F<f[N];F++)for(int div:set[n-1][F][p]){
			if((S&div)==div && ((div>>p)&1)>0){
				int sub = S-div;
				if(f[N]-1!=Math.max(f[Integer.bitCount(div)], f[Integer.bitCount(sub)]))continue;
				for(int j=0;j<n;j++)if(((sub>>j)&1)>0 && r[p][j]==1){
					res+=get(p, div)*get(j, sub);
				}
			}
		}
		return dp[p][S] = res;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		f = new int[17];
		for(int i=1;i<17;i++){
			int x = i;
			while(1 < x){
				f[i]++;
				x = x/2+x%2;
			}
		}
		set = new Set[16][5][16];
		for(int i=0;i<16;i++)for(int j=0;j<5;j++)for(int p=0;p<16;p++)set[i][j][p]=new HashSet<Integer>();
		for(int N=1;N<17;N++){
			for(int S=1;S<1<<N;S++){
				for(int p=0;p<N;p++)if(((S>>p)&1)>0)
					set[N-1][f[Integer.bitCount(S)]][p].add(S);
			}
		}
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt(); M = sc.nextInt();
			if((n|M)==0)break;
			M--;
			r = new int[n][n];
			for(int i=0;i<n;i++)for(int j=0;j<n;j++)r[i][j]=sc.nextInt();
			dp = new long[n][1<<n];
			for(long[]d:dp)Arrays.fill(d, -1);
//			for(int S=1;S<1<<n;S++)for(int p=0;p<n;p++)if(((S>>p)&1)>0){
//				int N = Integer.bitCount(S);
//				if(N==1){
//					dp[p][S] = 1; continue;
//				}
//				for(int F=0;F<f[N];F++)for(int div:set[n-1][F][p])
//					if((S&div)==div && ((div>>p)&1)>0){
//					int sub = S-div;
//					if(f[N]-1!=Math.max(f[Integer.bitCount(div)], f[Integer.bitCount(sub)]))continue;
//					for(int j=0;j<n;j++)if(((sub>>j)&1)>0 && r[p][j]==1){
//						dp[p][S]+=dp[p][div]*dp[j][sub];
//					}
//				}
//			}
//			System.out.println(dp[M][(1<<n)-1]);
			System.out.println(get(M, (1<<n)-1));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}