import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int a = 0;
		if (s.charAt(0) == (t.charAt(0))) {
			a += 1;
		}
		if (s.charAt(1) == (t.charAt(1))) {
			a += 1;
		}
		if (s.charAt(2) == (t.charAt(2))) {
			a += 1;
		}
		System.out.println(a);
	}
}
