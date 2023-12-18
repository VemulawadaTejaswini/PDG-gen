import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();

		int ss = s.length();
		if (k >= ss) {
			System.out.println(s);
		} else {
			String sss = s.substring(0, k);
			System.out.println(sss + "...");
		}

		sc.close();
	}
}