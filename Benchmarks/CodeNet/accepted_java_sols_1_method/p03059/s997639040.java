import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();

		sc.close();

		int p = T/A;
		System.out.println(p*B);
	}
}
