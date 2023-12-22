
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		
		char[] list1 = s.toCharArray();
		Arrays.sort(list1);
		s = String.valueOf(list1);
		
		char[] list2 = t.toCharArray();
		Arrays.sort(list2);
		t = String.valueOf(list2);
		
		t = new StringBuilder(t).reverse().toString();

		if (s.compareTo(t) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
	}
}
