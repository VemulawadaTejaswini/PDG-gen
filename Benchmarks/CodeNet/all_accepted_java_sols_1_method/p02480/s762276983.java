import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// x???????????\???
		int x = sc.nextInt();

		// x^3?????????
		System.out.println(x * x * x);

		sc.close();
	}
}