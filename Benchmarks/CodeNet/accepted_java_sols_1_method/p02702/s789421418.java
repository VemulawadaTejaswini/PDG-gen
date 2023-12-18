import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[] dp = new int[2019];
		int[] next = new int[2019];
		long count = 0;
		for (int i = 0; i < length; i++) {
		    int x = arr[i] - '0';
		    for (int j = 0; j < 2019; j++) {
		        next[(j * 10 + x) % 2019] += dp[j];
		    }
		    next[x]++;
		    count += next[0];
		    int[] tmp = next;
		    next = dp;
		    dp = tmp;
		    Arrays.fill(next, 0);
		}
		System.out.println(count);
	}
}

