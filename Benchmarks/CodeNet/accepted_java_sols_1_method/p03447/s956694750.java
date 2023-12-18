import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());

		System.out.println((x - a) % b);

		sc.close();
	}
}