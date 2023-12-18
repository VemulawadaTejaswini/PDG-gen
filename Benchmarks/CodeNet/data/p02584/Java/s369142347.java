import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		for(int i = 0; i < k; i++) {

			if(x >= 0) {
				x = x - d;
			} else {
				x = x + d;
			}

		}

		if(x < 0) {
			x = x * -1;
		}

		System.out.println(x);

	}

}