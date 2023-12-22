import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(n == 26) {
			for(int i = n - 1 ; i >= 0 ; i--) {
				if(i == 0) {
					System.out.println(-1);
					return;
				}
				if(s.charAt(i - 1) < s.charAt(i)) {
					String temp = s.substring(i);
					char base = s.charAt(i - 1);
					char min = 'z';
					for(int j = 0 ; j < temp.length() ; j++) {
						if(base < temp.charAt(j) && min > temp.charAt(j)) min = temp.charAt(j);
					}
					System.out.println(s.substring(0, i - 1) + min);
					return;
				}
			}
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
