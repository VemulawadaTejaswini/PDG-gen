import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0031
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextInt()) {
			String s = Integer.toString(sc.nextInt(), 2);
			for (int i = s.length() - 1; i >= 0; i--) {
				if (s.charAt(i) == '1') {
					System.out.print((int)pow(2, s.length() - i - 1));
					if (i != 0) 
						System.out.print(" ");
				} else {
					
				}
			}
			System.out.println();
		}
	}
}