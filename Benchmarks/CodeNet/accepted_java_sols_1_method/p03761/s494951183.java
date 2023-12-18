import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] time = new int[n][26];
		for(int i = 0; i < n; i++) {
			char[] chars = sc.next().toCharArray();
			for(char c : chars) {
				time[i][c-'a']++;
			}
		}
		int[] ans = time[0];
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 26; j++) {
				ans[j] = Math.min(time[i][j], ans[j]);
			}
		}
		Deque<Character> ad = new ArrayDeque<>();
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < ans[i]; j++) {
				ad.addLast((char) (i+'a'));
			}
		}
		for(char c : ad) {
			System.out.print(c);
		}
		System.out.println();
	}
}