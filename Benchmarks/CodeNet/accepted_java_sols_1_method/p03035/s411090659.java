import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a <= 5) {
			System.out.println(0);
		} else if (a <= 12) {
			System.out.println(b / 2);
		} else {
			System.out.println(b);
		}
	}
}
