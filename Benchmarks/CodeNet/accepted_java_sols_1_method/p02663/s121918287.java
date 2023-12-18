import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = 0;
		int m = 0;

		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();

		h = H2 - H1;
		if (M2 >= M1) {
			m = M2 - M1;
		} else {
			m = 60 - M1 + M2;
			h--;
		}

		System.out.println((h * 60) + m - K);

	}

}