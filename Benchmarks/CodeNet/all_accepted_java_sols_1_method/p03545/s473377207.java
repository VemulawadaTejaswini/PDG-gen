
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		for(int mask = 0 ; mask < 1<<(n-1) ; mask++) {
			int sum = (int)(s.charAt(0) - '0');
			String x = "" + s.charAt(0);
			for(int i = 0 ; i < s.length() - 1 ; i++) {
				if((mask&(1<<i)) >= 1) {
					sum += (int)(s.charAt(i + 1) - '0');
					x += "+" + s.charAt(i + 1);
				} else {
					sum -= (int)(s.charAt(i + 1) - '0');
					x += "-" + s.charAt(i + 1);
				}
			}
			if(sum == 7) {
				System.out.println(x + "=7");
				return;
			}
		}
	}
}