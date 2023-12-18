import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int d = Integer.parseInt(sc.nextLine());

		System.out.println(Math.min(a, b) + Math.min(c, d));

		sc.close();
	}
}