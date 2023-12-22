import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong(), m = 100L;
		int y = 0;

		while(m < x) {
			m += m / 100;
			y++;
		}

		System.out.println(y);
	}
}