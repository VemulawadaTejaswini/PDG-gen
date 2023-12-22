import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.next();

		boolean flg = true;
		int cnt = 0;
		if(s.charAt(0) != 'A') flg = false;
		for (int i = 1; i < s.length(); i++) {
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				if(i < 2 || i > s.length() - 2 || s.charAt(i) != 'C') {
					flg = false;
				}
				if(s.charAt(i) == 'C') cnt++;
			}
		}
		if(cnt != 1) flg = false;

		System.out.println(flg ? "AC" : "WA");
	}
}