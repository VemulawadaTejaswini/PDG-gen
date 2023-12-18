
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		if(s.length() % 2 == 1) {
			System.out.println("No");
		} else {
			String t = s.substring(0, s.length() / 2);
			String u = s.substring(s.length() / 2);
			if(t.equals(u)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
