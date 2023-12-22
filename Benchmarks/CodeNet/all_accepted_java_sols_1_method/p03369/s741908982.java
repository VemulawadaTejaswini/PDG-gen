import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = 700;
		for (int i = 0 ; i < s.length() ; i++) {
			if (s.charAt(i) == 'o') n += 100;
		}
		System.out.println(n);
	}
}
