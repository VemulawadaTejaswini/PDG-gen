import java.util.Scanner;

public class Main {
	static boolean[][] nodes;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		while (s.contains("B")) {
			s = s.replaceAll("^B|[01]B", "");
		}

		System.out.println(s);
		sc.close();
	}

}
