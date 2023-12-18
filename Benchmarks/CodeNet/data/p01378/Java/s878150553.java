import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public char change(char ch){
		switch (ch){
		case '{':
			return'}';
		case '[':
			return']';
		case '(':
			return')';
		case ')':
			return'(';
		case ']':
			return'[';
		case '}':
			return'{';
		}
		return 0;
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int length = in.length();
		int end = in.indexOf("iwi");
		char[] buffer = in.toCharArray();
		char[] a = new char[end];
		char[] b = new char[length - end - 3];
		for (int i = 0, j = end-1; i < end; i++,j--) {
			a[j] = buffer[i];
		}
		{
			int j = 0;
			for (int i = end+3; i < length; i++) {
				b[j] = change(buffer[i]);
				j++;
			}
		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		int al = a.length;
		int bl = b.length;
		int[][] dp = new int[al + 1][bl + 1];
		for(int i = 0 ; i < al+1;i++){
			for(int j = 0 ; j < bl + 1 ; j++){
				if(i == 0 && j == 0){
					continue;
				}
				if(i == 0 ){
					dp[i][j] = dp[i][j-1]+1;
					continue;
				}
				if(j == 0){
					dp[i][j] = dp[i-1][j]+1;
					continue;
				}
				dp[i][j] = Math.min(dp[i-1][j]+1, dp[i][j-1] + 1);				
				if(a[i-1] == b[j-1]){
					dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
				}
//				System.out.print(dp[i][j]+" ");
			}
//			System.out.println();
		}
//		System.out.println(dp[al][bl]);
		int ret = 3 + al+ bl - dp[al][bl];

		System.out.println(ret);
	}

	public static void main(String Args[]) {
		Main t = new Main();
		t.run();
	}
}