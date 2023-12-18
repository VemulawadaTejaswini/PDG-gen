import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int max = 0;
		for (int i = 0; i < t.length(); i++) {
			String tmp1 = s.substring(i);
			String tmp2 = t.substring(i);
			if (tmp1.indexOf(tmp2) != -1) max = Math.max(max, tmp2.length());
		}

		s = new StringBuilder(s).reverse().toString();
		t = new StringBuilder(t).reverse().toString();
		for (int i = 0; i < t.length(); i++) {
			String tmp1 = s.substring(i);
			String tmp2 = t.substring(i);
			if (tmp1.indexOf(tmp2) != -1) max = Math.max(max, tmp2.length());
		}
		System.out.println(t.length() - max);

		sc.close();

	}

}