import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[]S = new String[n];
		for(int i = 0; i < n; i++) {
			S[i] = sc.next();
		}
		sc.close();
		int[][]k = new int[n][26];
		for(int i = 0; i < n; i++) {
			String s = S[i];
			int l = s.length();
			for(int j = 0; j < l; j++) {
				int t = (int)s.charAt(j) - 'a';
				k[i][t]++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			int t = k[0][i];
			for(int j = 1; j < n; j++) {
				t = Math.min(t, k[j][i]);
			}
			for(int j = 0; j < t; j++) {
				char c = (char)(i + 'a');
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}