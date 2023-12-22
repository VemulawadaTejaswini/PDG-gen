import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long r = sc.nextInt();
			long g = sc.nextInt();

			System.out.println(g * 2 - r);
		}
	}
}
