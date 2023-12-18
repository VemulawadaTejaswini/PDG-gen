import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long H = scan.nextLong();
		long count = 0;
		long sum = 1;

		while(H > 0) {

			H /= 2;
			count += sum;
			sum *= 2;
		}
		System.out.println(count);
	}
}