import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		long count = 0;
		count = (x / 11) * 2;
		long m = x % 11;
		if (m == 0) {
			System.out.println(count);
			return;
		}
		count += (m < 7) ? 1 : 2;
		System.out.println(count);
	}

}
