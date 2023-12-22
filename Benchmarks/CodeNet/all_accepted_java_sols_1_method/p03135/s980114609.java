import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double T = sc.nextInt();
		double X = sc.nextInt();
		double sum = 0.0;

		sum = T / X;

		System.out.println(sum);
	}
}

