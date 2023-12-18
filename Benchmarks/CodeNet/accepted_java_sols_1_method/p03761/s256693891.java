import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] s = new int[n][26];
		for (int i = 0; i < n; i++) {
			char[] a = sc.next().toCharArray();
			for (int j = 0; j < a.length; j++) {
				s[i][a[j]-'a']++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			int min = 50;
			for (int j = 0; j < n; j++) {
				min = Math.min(min,s[j][i]);
			}
			for (int j = 0; j < min; j++) {
				sb.append((char)(i+'a'));
			}
		}
		System.out.println(new String(sb));
		sc.close();
	}
}