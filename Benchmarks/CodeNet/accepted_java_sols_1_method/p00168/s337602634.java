import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {
    		long[] dp = new long[31];
    		for(int i = 0; i < 31; i++) {
				dp[i] = 0;
			}
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 2;
			for(int i = 3; i < 31; i++) {
				dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
			}

    		while(true) {
    			int n = sc.nextInt();
    			if(n == 0)	break;
    			dp[n] = (dp[n]+9)/10;
    			System.out.println((dp[n]+364)/365);
    		}

    	}
    }

}


