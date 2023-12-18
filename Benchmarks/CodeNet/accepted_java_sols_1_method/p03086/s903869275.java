import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = 0;
		int cnt = 0;
		char[] cs = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T') {
				cnt++;
			} else {
				if(cnt >= len) {
					len = cnt;
				}
				cnt = 0;
			}
			if(cnt >= len) {
				len = cnt;
			}
		}
		System.out.println(len);
	}
}