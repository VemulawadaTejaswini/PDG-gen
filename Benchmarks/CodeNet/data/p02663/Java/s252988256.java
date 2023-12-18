import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();

		int k = sc.nextInt();

		int m =  Math.max(m1,m2) - Math.min(m1, m2);
		int result = 0;

		result = (h2 - h1) * 60 + m;
		result -= k;

		System.out.println(result);

	}
}
