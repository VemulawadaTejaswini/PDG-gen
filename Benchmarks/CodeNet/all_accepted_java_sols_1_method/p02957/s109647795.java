import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		long diff = Math.abs(a+b);

		if (diff % 2 == 1) {
			System.out.println("IMPOSSIBLE");
		} else {
			System.out.println(diff / 2);
		}

	}

}