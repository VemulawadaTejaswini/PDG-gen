import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		double m = 100;

		int i;

		for(i = 0; m < x; i++) {
			m = Math.floor(m * 1.01);
		}

		System.out.println(i);

		sc.close();

	}

}
