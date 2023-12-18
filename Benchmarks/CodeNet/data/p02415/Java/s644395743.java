import java.util.*;
import java.lang.*;

public class j8A {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		while (true) {
			s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '.') {
					System.out.println(".");
					System.exit(0);
				} else if (Character.isUpperCase(s.charAt(i)))
					System.out.print(Character.toLowerCase(s.charAt(i)));
				else if (Character.isLowerCase(s.charAt(i)))
					System.out.print(Character.toUpperCase(s.charAt(i)));
				else
					System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}

	}

}