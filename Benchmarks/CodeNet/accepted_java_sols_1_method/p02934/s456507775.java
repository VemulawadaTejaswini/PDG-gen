import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double a[] = new double[N];
		double b = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
			b += 1f/a[i];
		}

		System.out.println(1/b);


	}
}
