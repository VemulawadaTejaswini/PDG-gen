import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(solve());
	}
	
	public static boolean solve() {
		char[] s = sc.next().toCharArray();
		if (s[0] == '#') {
			return false;
		}
		int n = s.length;
		for(int i=0;i<n;i++) {
			s[i] -= '1';
		}
		int[][][][] dp = new int[2][2][9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				for(int k=0;k<2;k++) {
					dp[0][k][i][j] = i == 4 || j == 4 ? 1 << 29 : 0;
				}
			}
		}
		int now = 0;
		int next = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<9;k++) {
					Arrays.fill(dp[next][j][k], 1 << 29);
				}
			}
			for(int j=0;j<2;j++) {
				for(int f1=0;f1<9;f1++) {
					for(int f2=0;f2<9;f2++) {
						//use left
						if (valid(s[i], f2)) {
							dp[next][0][s[i]][f2] = Math.min(dp[next][0][s[i]][f2], dp[now][j][f1][f2] + (j == 0 ? 1 : 0));
						}
						//use right
						if (valid(f1, s[i])) {
							dp[next][1][f1][s[i]] = Math.min(dp[next][1][f1][s[i]], dp[now][j][f1][f2] + (j == 1 ? 1 : 0));
						}
					}
				}
			}
			now = 1 - now;
			next = 1 - next;
		}
		int min = 1 << 29;
		for(int i=0;i<2;i++) {
			for(int f1=0;f1<9;f1++) {
				for(int f2=0;f2<9;f2++) {
					min = Math.min(min, dp[now][i][f1][f2]);
				}
			}
		}
		System.out.println(min);
		return true;
	}
	
	public static boolean valid(int f1,int f2) {
		return f1 != 4 && f2 != 4 && f1 % 3 <= f2 % 3;
	}

}