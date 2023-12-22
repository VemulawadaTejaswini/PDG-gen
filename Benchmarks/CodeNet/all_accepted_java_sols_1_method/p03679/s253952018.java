import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int e = a - b;
		if (e >= 0) {
			System.out.println("delicious");
		} else {
			if (-e <= x) {
				System.out.println("safe");
			} else {
				System.out.println("dangerous");
			}
		}

		sc.close();
	}
}