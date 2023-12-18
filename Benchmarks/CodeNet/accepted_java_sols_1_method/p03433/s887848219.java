import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int a = Integer.parseInt(sc.nextLine());

		int i = n % 500;
		if (i <= a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}