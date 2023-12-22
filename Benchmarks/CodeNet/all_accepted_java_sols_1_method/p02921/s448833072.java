import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		int cnt = 0;

		for (int i = 0 ; i < 3; i++) {
			String si = s.substring(i, i + 1);
			String ti = t.substring(i, i + 1);

			if (si.equals(ti)) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}

