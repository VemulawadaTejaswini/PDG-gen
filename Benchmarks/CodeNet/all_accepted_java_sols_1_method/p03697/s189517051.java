import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int ab = sc.nextInt();
			ab += sc.nextInt();

			if (ab >= 10) {
				System.out.println("error");
			} else {
				System.out.println(ab);
			}
		} finally {
			sc.close();
		}
	}
}