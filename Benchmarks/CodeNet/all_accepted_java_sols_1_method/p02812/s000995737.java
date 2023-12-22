import java.util.Scanner;

public class Main {

	private static final String ABC = "ABC";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int count = 0;
		int it = 0;
		int result = 0;
		while (result != -1) {
			result = s.indexOf(ABC, it);
			if (result != -1) {
				count++;
				it = result + ABC.length();
			}
		}

		System.out.println(count);

	}
}
