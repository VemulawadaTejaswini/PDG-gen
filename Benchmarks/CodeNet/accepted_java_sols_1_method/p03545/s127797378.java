
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		for(int mask = 0 ; mask < 1<<(n - 1) ; mask++) {
			String temp = s.charAt(0) + "";
			int value = (int)(s.charAt(0) - '0');
			for(int i = 0 ; i < 3 ; i++) {
				if((mask&(1<<i)) >= 1) {
					temp += "+" + s.charAt(i + 1);
					value += (int)(s.charAt(i + 1) - '0');
				} else {
					temp += "-" + s.charAt(i + 1);
					value -= (int)(s.charAt(i + 1) - '0');
				}
			}
			if(value == 7) {
				System.out.println(temp + "=7");
				return;
			}
		}
	}
}