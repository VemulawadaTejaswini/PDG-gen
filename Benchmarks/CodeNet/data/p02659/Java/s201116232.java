import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		double C = (double)A * B;
		sc.close();
		System.out.println((long)C);
	}

}