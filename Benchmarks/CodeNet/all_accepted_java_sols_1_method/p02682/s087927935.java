import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int sum = 0;

		while (a != 0 && k != 0) {
			sum++;
			a--;
			k--;
		}

		while (b != 0 && k != 0) {
			b--;
			k--;
		}

		while (c != 0 && k != 0) {
			sum--;
			c--;
			k--;
		}

		System.out.println(sum);

		sc.close();
	}

}
