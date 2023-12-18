
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		String s = "";

		n = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			s = sc.next();
			if (s.equals("Y"))
				break;
		}

		if (s.equals("Y"))
			System.out.println("Four");
		else
			System.out.println("Three");

		sc.close();
	}

}
