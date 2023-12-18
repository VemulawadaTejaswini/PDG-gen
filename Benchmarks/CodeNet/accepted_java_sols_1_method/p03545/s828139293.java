
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		for(int mask = 0 ; mask < (1<<(n - 1)) ; mask++) {
			String temp = "";
			int ret = 0;
			for(int i = n - 1 ; i >= 0 ; i--) {
				if(i == n - 1) {
					temp += s.charAt(n - 1 - i);
					ret += s.charAt(n - 1 - i) - '0';
				} else if((mask&(1<<i)) >= 1) {
					temp += "+" + s.charAt(n - 1 - i);
					ret += s.charAt(n - 1 - i) - '0';
				} else {
					temp += "-" + s.charAt(n - 1 - i);
					ret -= s.charAt(n - 1 - i) - '0';
				}
			}
			if(ret == 7) {
				System.out.println(temp + "=7");
				return;
			}
		}
	}
}