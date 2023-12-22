import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int n = s.length();
		if(n == 26) {
			for(int i = c.length - 1 ; i >= 1 ; i--) {
				if(c[i - 1] < c[i]) {
					for(int j = n - 1 ; j >= i ; j--) {
						if(c[i - 1] < c[j]) {
							c[i - 1] = c[j];
							System.out.println(new String(c, 0, i));
							return;
						}
					}
				}
			}
			System.out.println(-1);
		} else {
			char min = 'z';
			int[] cnt = new int[26];
			for(int i = 0 ; i < s.length() ; i++) {
				cnt[(int)(s.charAt(i) - 'a')]++;
			}
			for(int i = 0 ; i < 26 ; i++) {
				if(cnt[i] == 0) {
					min = (char)(i + 'a');
					break;
				}
			}
			System.out.println(s + min);
		}
	}
}
