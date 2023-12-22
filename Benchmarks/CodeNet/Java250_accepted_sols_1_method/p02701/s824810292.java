import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		HashSet<String> hs = new HashSet<String>();
		String s = null;

		sc.nextLine();

		for (int i = 0; i < n; i++) {

			s = sc.nextLine();
			hs.add(s);
		}

		System.out.println(hs.size());

	}

}
