import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();

		int sum = A + B;
		int hiku = A - B;
		int kakeru = A * B;

		int max = sum;

		if (hiku > max) {
			max = hiku;
		}

		if (kakeru > max) {
			max = kakeru;
		}

		System.out.println(max);

	}

}
