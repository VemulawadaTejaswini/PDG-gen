import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double p = 3.141592653589;
		double ca;
		double cm;

		ca = r * r * p;
		cm = r * 2 * p;
		
		String str1 = String.format("%8f",ca);
		String str2 = String.format("%8f",cm);

		System.out.printf(str1 + " " + str2);
		sc.close();
	}

}