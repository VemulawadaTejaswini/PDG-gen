import java.util.Arrays;
import java.util.Scanner;

//The Castle
public class Main{

	int m, n;
	double[][] dp, p;

	double get(int S, int K){
//		System.out.println("S:"+S+" K:"+K);
		if(dp[S][K]!=-1)return dp[S][K];
		double res = 0;
		for(int last=0;last<m;last++)if(((S>>last)&1)>0){
			double sum = 0;
			for(int j=0;j<=K;j++){
				double e = get(S-(1<<last), j);
				for(int k=j+1;k<=K;k++)e*=p[last][k];
				e*=1-p[last][K+1];
				sum += e;
			}
			res = Math.max(res, sum);
		}
		return dp[S][K] = res;
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); n = sc.nextInt();
		p = new double[m][n+2];
		for(int i=0;i<m;i++){
			p[i][0] = 1;
			for(int j=1;j<=n;j++)p[i][j]=sc.nextDouble();
		}
		dp = new double[1<<n][n+1];
		for(double[]d:dp)Arrays.fill(d, -1);
		for(int i=0;i<m;i++)for(int j=0;j<=n;j++){
			double e = 1;
			for(int k=0;k<=j;k++)e*=p[i][k];
			e*=1-p[i][j+1];
			dp[1<<i][j] = e;
		}
		double res = 0;
		for(int S=1;S<1<<m;S++)res=Math.max(res, get(S, n));
		System.out.printf("%.10f\n", res);
//		System.out.printf("%.10f\n", get(1, 0));
//		System.out.printf("%.10f\n", get(1, 1));
//		System.out.printf("%.10f\n", get(1, 2));
//		System.out.printf("%.10f\n", get(1, 3));
//		System.out.printf("%.10f\n", get(2, n));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}