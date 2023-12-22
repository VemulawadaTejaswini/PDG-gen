import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int amari = n % 1000;
		if (amari != 0) {
			System.out.println(1000 - amari);
		} else {
			System.out.println(0);
		}
	}
}
