import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		double b = scan.nextDouble();
		double result = (double)(a * b);
		result = (long)result;
		//System.out.println(result);
		System.out.println(String.format("%.0f", result));
	}

}
