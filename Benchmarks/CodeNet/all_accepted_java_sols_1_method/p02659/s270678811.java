import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		int x = (int) (b * 100 + 0.5);

		System.out.println((long) (a * x) / 100);
	}

}
