import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		if (x >= 30) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
