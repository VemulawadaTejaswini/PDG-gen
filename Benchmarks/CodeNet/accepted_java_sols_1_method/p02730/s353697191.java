import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = s.substring(0, (s.length() - 1) / 2);
		String s2 = s.substring(((s.length() + 3) / 2) - 1, s.length());
		if (s.equals(new StringBuffer(s).reverse().toString()) && s1.equals(new StringBuffer(s1).reverse().toString())
				&& s2.equals(new StringBuffer(s2).reverse().toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}