import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TreeSet<Integer> map = new TreeSet<Integer>(Collections.reverseOrder());
		int[] dp = new int[100001];
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		dp[0] = 0;
		/* 1円について */ map.add(1);
		for(int i = 1; i < dp.length; i++) dp[i] = i;
		/* 6円について */ for(int i = 6; i < dp.length; i *= 6) map.add(i);
		/* 9円について */ for(int i = 9; i < dp.length; i *= 9) map.add(i);
		for(int d : map) {
			dp[d] = 1;
			for(int i = 0; i + d < dp.length; i++) dp[i + d] = Math.min(dp[i] + 1, dp[i + d]);
		}
		System.out.println(dp[N]);
	}
}