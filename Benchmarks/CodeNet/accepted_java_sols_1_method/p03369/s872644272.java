import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 700;
		String S = sc.next();
		String[] s2 = S.split("");

		if (s2[0].equals("o"))
			m += 100;
		if (s2[1].equals("o"))
			m += 100;
		if (s2[2].equals("o"))
				m += 100;
		System.out.println(m);
	}
}