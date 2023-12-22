
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		sc.close();

		for (int i = a; i <= b; i++) {
			if (i / 10000 == i % 10 && i % 10000 / 1000 == i % 100 / 10) {
				count++;
			}
		}
		System.out.print(count);
	}
}