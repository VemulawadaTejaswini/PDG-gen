import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// standard input
		int height = sc.nextInt();
		int width = sc.nextInt();

		// solve
		String result = null;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ("snuke".equals(sc.next())) {
					result = Character.toString((char) (j + 65)) + (i + 1);
				}
			}
		}

		// standard output
		System.out.println(result);
	}
}