import java.util.Scanner;

public class Main {

	public static final long CONST = 100000007L;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String strS = scan.next();
		String strT = scan.next();

		int count = 0;

		for (int i = 0; i < 3; i++) {
			if ((strS.substring(i, i+1)).equals(strT.substring(i, i+1))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
