import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();

		System.out.println(Math.abs((x - 2) * (y - 2)));
		sc.close();
	}
}