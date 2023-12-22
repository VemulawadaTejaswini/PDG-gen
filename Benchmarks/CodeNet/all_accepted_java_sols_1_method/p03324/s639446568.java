import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();

		int min = (int) Math.pow((double) 100, (double) d);
		if (n == 100) {
			System.out.println(min * 101);
		} else {
			System.out.println(min * n);
		}

		sc.close();
	}
}