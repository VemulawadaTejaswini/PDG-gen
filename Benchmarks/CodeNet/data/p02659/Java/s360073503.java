import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		double B = sc.nextDouble();

		long B100 = (long)(100 * B);

		long ans = A*B100 / 100;

		System.out.println(ans);

	}

}
