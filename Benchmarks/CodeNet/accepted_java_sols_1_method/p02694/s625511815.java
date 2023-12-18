import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long total = 100;
		int y = 0;

		while (total < x) {
			total *= 1.01;
			y++;
		}
		System.out.println(y);
	}
}