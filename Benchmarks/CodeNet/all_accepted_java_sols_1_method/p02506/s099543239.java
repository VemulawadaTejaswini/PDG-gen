import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		String w = sc.next();

		while (true) {
			String s = sc.next();
			if (s.equals("END_OF_TEXT")) break;
			cnt = w.toLowerCase().equals(s.toLowerCase()) ? cnt + 1 : cnt;
		}

		System.out.println(cnt);

	}

}