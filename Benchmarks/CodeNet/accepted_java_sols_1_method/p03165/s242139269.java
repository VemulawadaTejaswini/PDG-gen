import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[][] dp = new int[len1 + 1][len2 + 1];
		for(int i = 1 ; i <= len1; i++) {
			for(int j = 1 ; j <= len2 ; j++) {
				if(arr1[i - 1] == arr2[j - 1])
					dp[i][j] = dp[i-1][j-1] + 1;
				else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		StringBuilder sb = new StringBuilder();
		int i = len1 , j = len2;
		while(i > 0 && j > 0) {
			if(arr1[i-1] ==arr2[j - 1]) {
				sb.append(arr1[i - 1]);
				i--;
				j--;
			}
			else {
				if(dp[i-1][j] > dp[i][j-1]) {
					i--;
				}
				else {
					j--;
				}
			}
		}
		System.out.println(sb.reverse());
	}
}
