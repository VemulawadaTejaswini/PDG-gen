import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();

			System.out.println(n * 800 - (int)(n / 15) * 200);

		} finally {
			sc.close();
		}
	}
}