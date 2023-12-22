import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer int1 = sc.nextInt();
		Integer int2 = sc.nextInt();

		Integer seki = int1 * int2;

		if (seki % 2 == 0) {
			System.out.println("Even");

		} else {
			System.out.println("Odd");
		}

	}

}
