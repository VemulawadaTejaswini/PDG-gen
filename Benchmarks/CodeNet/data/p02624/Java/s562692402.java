import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute16_1();
	}
	
	private static void execute16_1() {
		try (Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			long[] dp = new long[n+1];
			
			dp[0]=1;
			
			long ans = 0;
			
			for(int i=2;i<=n;i++) {
				int x=i+i;
				while(n>=x) {
					dp[x]++;
					x+=i;
				}
			}

			ans+=1;
			for(int i=2;i<n+1;i++) {
				ans+=i*(dp[i]+2);
			}
			System.out.println(ans);
		}
	}
}