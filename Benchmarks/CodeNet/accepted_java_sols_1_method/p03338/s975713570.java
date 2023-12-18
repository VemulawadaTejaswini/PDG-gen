import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char s[] = sc.next().toCharArray();
		int[][] az = new int[s.length][26];

		az[0][s[0] - 'a']++;
		for (int i = 1; i < s.length; i++) {
			az[i][s[i] - 'a']++;
			for (int j = 0; j < 26; j++) {
				az[i][j] += az[i - 1][j];
			}
		}
		int max = 0;
		int cnt;
		for (int i = 0; i < s.length; i++) {
			cnt = 0;
			for (int j = 0; j < 26; j++) {
				if (az[i][j] > 0 && az[s.length - 1][j] - az[i][j] > 0) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}
