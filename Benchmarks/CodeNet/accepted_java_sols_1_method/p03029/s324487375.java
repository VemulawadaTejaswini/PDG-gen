import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int P = scan.nextInt();

		int Anum = A * 3;

		System.out.println((Anum + P) / 2);
	}
}