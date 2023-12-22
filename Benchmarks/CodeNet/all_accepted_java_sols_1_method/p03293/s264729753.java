import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean b = false;
		for(int i = 0; i < s.length() && !b; i++)
			b |= s.equals(t.substring(i, s.length()) + t.substring(0,i));
		System.out.println(b ? "Yes" : "No");
	}
}