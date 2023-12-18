import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String[] a2 = a.split("");
		String b = scan.nextLine();
		String[] b2 = b.split("");
		int al = a.length();
		int bl = b.length();
		if(al<bl){
			int n=al; al=bl; bl=n;
			String[] nu=a2; a2=b2; b2=nu;
		}
		int[][] dp = new int[bl+1][al+1];
		for(int i=1;i<=al;++i){
			dp[0][i]=dp[0][i-1]+1;
		}
		for(int i=1;i<=bl;++i){
			dp[i][0]=dp[i-1][0]+1;
		}
		for(int i=1;i<=bl;++i){
			for(int j=1;j<=al;++j){
				int min=0;
				if(b2[i-1].equals(a2[j-1])==true){
					min = Min(dp[i-1][j-1],dp[i][j-1]+1,dp[i-1][j]+1);
				} else {
					min = Min(dp[i-1][j-1]+1,dp[i][j-1]+1,dp[i-1][j]+1);
				}
				dp[i][j]=min;
			}
		}
		System.out.println(dp[bl][al]);
	}

	public static int Min(int a, int b, int c){
		int min=a;
		if(a>b){
			min=b;
		}
		if(min>c){
			min=c;
		}
		return min;
	}
}