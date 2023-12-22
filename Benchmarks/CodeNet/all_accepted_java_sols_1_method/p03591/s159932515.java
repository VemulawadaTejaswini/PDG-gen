import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = s.substring(0, Math.min(4, s.length()));
		if (t.equals("YAKI")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
