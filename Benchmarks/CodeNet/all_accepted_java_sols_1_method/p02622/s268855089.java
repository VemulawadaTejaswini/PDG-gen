import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String a = sc.next();
		String b = sc.next();
		
		int c = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				c++;
			}
		}
		

		System.out.println(c);

	}
}