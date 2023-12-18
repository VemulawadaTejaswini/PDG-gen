import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println(a + a * a + a * a * a);

		sc.close();
	}

}
