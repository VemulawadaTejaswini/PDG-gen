import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		if ((s.length() == t.length()) && (s + s).contains(t)) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}