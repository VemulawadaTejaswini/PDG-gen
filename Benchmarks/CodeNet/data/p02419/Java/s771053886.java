import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		int cnt = 0;
		while (true) {
			String str = sc.next();
			if (str.equals("END_OF_TEXT"))
				break;
			if (str.equalsIgnoreCase(w))
				++cnt;
		}
		System.out.println(cnt);
	}
}
