
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = String.valueOf(scan.nextInt());
		String b = String.valueOf(scan.nextInt());
		int c = Integer.valueOf(a.concat(b));
		
		int d = (int) Math.sqrt(c);
		if (Math.pow(d, 2) == c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
