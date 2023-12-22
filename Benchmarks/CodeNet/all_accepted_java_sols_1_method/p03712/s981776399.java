import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}

		System.out.println();

		for (int i = 0; i < h; i++) {
			String s = sc.next();
			System.out.print("#");
			System.out.print(s);
			System.out.print("#");
			System.out.println();
		}


		System.out.println();


		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}

		sc.close();
	}

}
