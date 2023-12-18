import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int W=sc.nextInt();

    	int[] w=new int[N];
    	int[] v=new int[N];

    	int[][] dp=new int[N+1][W+1];

    	for(int i=0;i<N;i++) {
    		v[i]=sc.nextInt();
    		w[i]=sc.nextInt();
    	}


    	for(int j=0;j<=W;j++) {
    		dp[N][j]=0;
    	}

    	for(int i=N-1;i>0;i--) {
    		for(int j=0;j<=W;j++) {
    			if(j-w[i]<0) {
    				dp[i-1][j]=dp[i][j];
    			}else {
    				dp[i-1][j]=Math.max(dp[i][j],dp[i][j-w[i]]+v[i]);
    			}
    		}
    	}


//    	for(int i=0;i<N;i++) {
//    		for(int j=0;j<=W;j++) {
//    			if(j-w[i]<0) {
//    				dp[i+1][j]=dp[i][j];
//    			}else {
//    				dp[i+1][j]=Math.max(dp[i][j],dp[i][j-w[i]]+v[i]);
//    			}
//    		}
//    	}

    	System.out.println(dp[0][W]);

    }
}

