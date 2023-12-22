import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int zero = 0;
		int one = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				zero++;
			} else if (s.charAt(i) == '1') {
				one++;
			}
		}
		System.out.println(s.length() - Math.abs(zero - one));
 	}
}