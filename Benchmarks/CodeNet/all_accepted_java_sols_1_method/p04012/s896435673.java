import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		boolean ans = true;
		if (w.length() % 2 == 1) {
			ans = false;
		}
		for(int i = 0; i < w.length(); i++) {
			char x = w.charAt(i);
			int count = (int) w.chars().filter(ch -> ch == x).count();
			if (count % 2 == 1) {
				ans = false;
			}
		}
		System.out.println(ans ? "Yes" : "No");
	}
}

