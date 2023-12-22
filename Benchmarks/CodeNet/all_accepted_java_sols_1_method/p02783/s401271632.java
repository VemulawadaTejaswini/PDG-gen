import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double H = sc.nextInt();
		double A = sc.nextInt();
		double Answer;

		Answer = Math.ceil(H/A);

		int D = (int) Answer;
		System.out.println(D);
	}
}
