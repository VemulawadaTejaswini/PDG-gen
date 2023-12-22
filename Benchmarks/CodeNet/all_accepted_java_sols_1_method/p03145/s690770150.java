import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int AB = Integer.parseInt(sc.next());
		int BC = Integer.parseInt(sc.next());
		int CA = Integer.parseInt(sc.next());
		sc.close();

		int triangle = AB * BC / 2;
		System.out.println(triangle);
	}
}