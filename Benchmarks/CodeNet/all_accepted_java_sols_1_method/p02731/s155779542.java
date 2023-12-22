import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double N = input.nextDouble();
		double dimension = N/3;
		System.out.println(dimension*dimension*dimension);
	}
}