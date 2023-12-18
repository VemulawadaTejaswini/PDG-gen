import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		x = Math.abs(x);

//		if (0 < x) {
			if (x / d < k) {
				if ((k - x / d) % 2 == 0) {
					System.out.println(Math.abs(x - (x / d * d)));
				} else {
					System.out.println(Math.abs(x - (x / d * d) - d));
				}
			} else {
				System.out.println(Math.abs(x - k * d));
			}
//		}



		sc.close();

	}

}