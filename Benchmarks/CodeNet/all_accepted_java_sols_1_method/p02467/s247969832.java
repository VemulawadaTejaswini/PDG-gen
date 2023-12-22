import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.print(n + ":");

		int tmp = n;
		for (int i = 2; i * i <= n; i++) {
			while (tmp % i == 0) {
				System.out.print(" " + i);
				tmp /= i;
			}
		}
		if (tmp != 1) {
			System.out.print(" " + tmp);
		}

		System.out.println();

		sc.close();
	}
}