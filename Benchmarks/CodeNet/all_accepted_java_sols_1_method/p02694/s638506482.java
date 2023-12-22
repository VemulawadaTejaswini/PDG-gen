import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		boolean b = true;
		long l = 100;
		int count = 0;
		while (b) {
			count++;
			l = (long) (l * 1.01);
			if (l >= x) {
				System.out.println(count);
				b = false;
			}

		}

		sc.close();
	}
}