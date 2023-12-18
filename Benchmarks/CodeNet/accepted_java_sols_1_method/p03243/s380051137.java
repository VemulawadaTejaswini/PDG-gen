
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//100の位を求める
		String digits = String.valueOf(n / 100);
		
		String s = digits + digits + digits;
		
		int continuing = Integer.valueOf(s);
		
		
		if (continuing >= n) {
			System.out.println(continuing);
		} else {
			String digits2 = String.valueOf(n / 100 + 1);
			
			String str2 = digits2 + digits2 + digits2;
			
			int continuing2 = Integer.valueOf(str2);
			System.out.println(continuing2);
		}
		
	}
}