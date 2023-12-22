
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int count = 0;
		for (int i = a; i <= b; i++) {
			String s = String.valueOf(i);

			String reverse = new String();
			for (int j = s.length(); j > 0; j--) {
				reverse = reverse.concat(s.substring(j -1, j));
				
			}
			if (reverse.equals(s)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
