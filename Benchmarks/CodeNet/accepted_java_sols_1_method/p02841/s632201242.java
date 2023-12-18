import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M1 = sc.nextInt();
		int D1 = sc.nextInt();
		int M2 = sc.nextInt();
		int D2 = sc.nextInt();
		sc.close();

		System.out.println(D2 == 1 ? 1 : 0);

	}

}