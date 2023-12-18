import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		String w = sc.next().toLowerCase();

		while (true) {
			String s = sc.next().toLowerCase();
			if (s.equals("end_of_text")) break;
			cnt = s.equals(w) ? cnt + 1 : cnt;
		}

		System.out.println(cnt);

	}

}