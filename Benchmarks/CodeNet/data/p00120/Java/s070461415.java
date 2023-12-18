import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextDouble()){
			String[] s = sc.nextLine().split(" ");
			double len = Double.parseDouble(s[0]);
			r = new double[s.length - 1];

			for(int i=1;i<s.length;i++){
				r[i-1] = Double.parseDouble(s[i]);
			}

			double min = Double.MAX_VALUE;
			dp = new double[1<<12][12];

			for(int i=0;i<r.length;i++){
				min = Math.min(min,r[i]+solve(r.length-1,1<<i,i));
			}

			System.out.println(min <= len ? "OK" : "NA");
		}
	}

	private static double[] r;
	private static double[][] dp;

	private static double solve(int rem,int flg,int last){
		if(dp[flg][last] > 0) return dp[flg][last];
		if(rem == 0) return dp[flg][last] = r[last];

		double res = Double.MAX_VALUE;
		for(int i=0;i<r.length;i++){
			if(((1<<i) & flg) > 0) continue;
			double tmp = Math.sqrt( Math.pow(r[last]+r[i],2) - Math.pow(r[last]-r[i],2) );
			res = Math.min(res,tmp+solve(rem-1,flg|(1<<i),i));
		}

		return dp[flg][last] = res;
	}
}