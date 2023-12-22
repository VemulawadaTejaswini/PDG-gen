import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int count = 0;
		for (int i = a; i <= b; i++) {
			int a5 = i / 10000;
			int a4 = i % 10000 / 1000;
			int a2 = i % 100 / 10;
			int a1 = i % 10;
			if (a5 == a1 && a4 == a2) {
				count++;
			}
		}
		System.out.println(count);

		sc.close();
	}
}