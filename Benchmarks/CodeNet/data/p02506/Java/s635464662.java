import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		String word = sc.next();
		word.toLowerCase();
		while (true) {
			String str = sc.next();
			if (str.equals("END_OF_TEXT"))
				break;
			str.toLowerCase();
			if (str.equals(word))
				ans++;
		}
		System.out.println(ans);
	}
}