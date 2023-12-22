import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int max = 0;
		for (int i = 0; i < s.length() -  t.length() + 1; i++) {
			String a = s.substring(i, t.length() + i);
			int cnt = 0;
			for (int j = 0; j < t.length(); j++) {
				if (a.charAt(j) == t.charAt(j)) cnt++;
			}
			max = Math.max(max, cnt);
		}

		System.out.println(t.length() - max);

		sc.close();

	}

}