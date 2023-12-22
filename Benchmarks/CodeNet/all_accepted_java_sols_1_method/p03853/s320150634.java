import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] cc = new String[h+1];
		for (int i = 1; i <= h; i++) {
			cc[i] = sc.next();
		}

		for (int i = 1; i <= 2 * h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(cc[(i+1)/2].charAt(j));
			}
			System.out.println();
		}
	}

}
