import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int cnt1 = 0;
		int cnt2 = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				if (s.charAt(i) == '0') {
					cnt2++;
				} else {
					cnt1++;
				}
			} else if (i % 2 != 0) {
				if (s.charAt(i) == '0') {
					cnt1++;
				} else {
					cnt2++;
				}
				
			}
		}
		
		int ans = Math.min(cnt1, cnt2);
		System.out.println(ans);

	}
}
