import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long[][] dp= new long[11][1010];
		int n, s;
		dp[0][0]=1;
		for(int i=0; i<=100; i++) {
			for(int j=9; j>=0; j--) {
				for(int k=0; k<=1000-i; k++) {
					dp[j+1][k+i]+=dp[j][k];
				}
			}
		}
		while(sc.hasNext()) {
			n=sc.nextInt();
			s=sc.nextInt();
			if(n==0 && s==0)	break;
			System.out.println(dp[n][s]);
		}
        
	}
}
