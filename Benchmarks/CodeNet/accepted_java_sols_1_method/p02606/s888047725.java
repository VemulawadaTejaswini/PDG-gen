import java.util.Scanner;

// Aising2020_A
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int d = sc.nextInt();

		int i = 0;
		int count = 0;

		while (true) {
			if (d * i > R) {
				break;
			}
			if (L <= d * i && d * i <= R) {
				count++;
			}
			i++;
		}

		System.out.println(count);
		sc.close();
	}

}
