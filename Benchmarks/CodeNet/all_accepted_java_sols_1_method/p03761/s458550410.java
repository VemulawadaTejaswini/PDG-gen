import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0 ; i < n ; i++) s[i] = sc.next();
		int[] a = new int[26];
		char[] b = new char[26];
		for(char c = 'a' ; c <= 'z' ; c++) b[(int)(c - 'a')] = c;
		Arrays.fill(a, Integer.MAX_VALUE);
		for(int i = 0 ;  i < n ; i++) {
			int[] cnt = new int[26];
			for(int j = 0 ; j < s[i].length() ; j++) {
				for(char c = 'a' ; c <= 'z' ; c++) {
					if(s[i].charAt(j) == c) cnt[(int)(c - 'a')]++;
				}
			}
			for(int j = 0 ; j < 26 ; j++) {
				a[j] = Math.min(a[j], cnt[j]);
			}
		}
		for(int i = 0 ; i < 26 ; i++) {
			if(a[i] != Integer.MAX_VALUE && a[i] >= 1) {
				for(int j = 0 ; j < a[i] ; j++) {
					System.out.print(b[i]);
				}
			}
		}
		System.out.println();
	}
}
