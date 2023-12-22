import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = 0;
		int r = 0;
		for (int i = 0; i < n; i++) {
			int h = in.nextInt();
			if (h >= max) {
				r++;
				max = h;
			}
		}
		System.out.println(r);
	}

}
