import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n / 15;
		int x = 800 * n;
		int y = 200 * count;

		System.out.println(x - y);

	}

}
