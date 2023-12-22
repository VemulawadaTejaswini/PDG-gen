
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = 0;
		if (a + w < b) {
			ans = b - (a + w);
		} else if (a >= b +w) {	
			ans = a - (b + w);
		} else {
			ans = 0;
		}
		
		System.out.println(ans);
		
	}
}