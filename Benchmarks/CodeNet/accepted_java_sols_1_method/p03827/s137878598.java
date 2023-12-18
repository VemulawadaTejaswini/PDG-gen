
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int ans = 0;
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				cnt++;
			} else {
				cnt--;
			}
			
			ans = Math.max(ans, cnt);
		}
		
		System.out.println(ans);
		
	}
}