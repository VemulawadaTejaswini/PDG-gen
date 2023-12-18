import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int rgb = 0;
			rgb += sc.nextInt() * 100;
			rgb += sc.nextInt() * 10;
			rgb += sc.nextInt();

			if (rgb % 4 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} finally {
			sc.close();
		}
	}
}