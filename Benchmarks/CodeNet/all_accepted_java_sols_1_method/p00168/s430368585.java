import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		while(true) {

			int N=sc.nextInt();

			if(N==0) break;

			int[] dp=new int[N+1];

			for(int i=0;i<N+1;i++) dp[i]=0;

			dp[0]=1;

			for(int i=0;i<N;i++) {
				for(int j=1;j<=3;j++) {
					if(i+j>N) break;
					dp[i+j]+=dp[i];
				}
			}

			int ans=(((dp[N]+9)/10)+364)/365;
			System.out.println(ans);
		}

		sc.close();

	}

}

