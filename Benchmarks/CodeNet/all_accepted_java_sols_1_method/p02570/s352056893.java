import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double distance = sc.nextInt();
		double time = sc.nextInt();
		double speed = sc.nextInt();
		
		if ((distance - time * speed) <= 0) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");

	}
}