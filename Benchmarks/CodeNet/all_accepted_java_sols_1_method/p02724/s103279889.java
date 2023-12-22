import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int taryo = sc.nextInt();
			int ureshii500 = taryo / 500;
			int ureshii5 = (taryo - (ureshii500 * 500)) / 5;

			System.out.println((ureshii500 * 1000) + (ureshii5 * 5));

		} finally {
			sc.close();
		}
	}

}
