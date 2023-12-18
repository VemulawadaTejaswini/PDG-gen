import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int P = scan.nextInt();

		int Ap = (P + A * 3)/ 2;

		System.out.println(Ap);
	}

}