import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ss = sc.next();

		String sss = ss.substring(0, ss.length() - 1);

		if (s.equals(sss)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}