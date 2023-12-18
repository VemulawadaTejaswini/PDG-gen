import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sc.close();

		for (int i = 0; i < s.length(); i++) {
			if ((s.substring(i) + s.substring(0, i)).equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
