import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int p = sc.nextInt();

		int sum = a * 3 + p;

		System.out.println(sum / 2);

		sc.close();

	}
}