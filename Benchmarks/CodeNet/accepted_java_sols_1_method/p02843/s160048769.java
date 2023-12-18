import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int X = stdin.nextInt();
		String dp[] = new String[110000];
		
		for(int i=0;i<110000;i++) {
			dp[i] = "No";
		}
		
		dp[0] = "Yes";
		dp[100] = "Yes";
		dp[101] = "Yes";
		dp[102] = "Yes";
		dp[103] = "Yes";
		dp[104] = "Yes";
		dp[105] = "Yes";
		
		for(int i=0;i<=X;i++) {
			if(dp[i].equals("Yes")) {
				for(int j=0;j<=5;j++) {
					if(dp[i].equals("Yes"));
						dp[i+100+j] = "Yes";
				}
			}
		}
		if(dp[X].contentEquals("Yes")) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}
