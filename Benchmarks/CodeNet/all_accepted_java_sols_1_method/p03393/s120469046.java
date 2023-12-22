import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println(-1);
			return;
		}
		if(n == 26) {
			for(int i = 25 ; i >= 1 ; i--) {
				if(s.charAt(i - 1) < s.charAt(i)) {
					String temp = s.substring(i);
					char c = 'z';
					for(int j = 0 ; j < temp.length() ; j++) {
						if(s.charAt(i - 1) < temp.charAt(j) && c > temp.charAt(j)) c = temp.charAt(j);
					}
					System.out.println(s.substring(0, i - 1) + c);
					return;
				}
			}
		} else {
			for(char c = 'a' ; c <= 'z' ; c++) {
				boolean ok = true;
				for(int i = 0 ; i < n ; i++) {
					if(c == s.charAt(i)) ok = false;
				}
				if(ok) {
					System.out.println(s + c);
					return;
				}
			}
		}
	}
}
