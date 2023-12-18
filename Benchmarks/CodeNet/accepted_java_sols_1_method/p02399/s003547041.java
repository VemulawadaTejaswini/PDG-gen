import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int quo = a / b;
		int rem = a % b;
		String f = String.format("%.5f", ((double) a / (double) b));
		System.out.println(quo + " " + rem + " " + f);
	}

}