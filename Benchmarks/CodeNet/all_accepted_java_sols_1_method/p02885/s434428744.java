import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int open = A - 2 * B;

		if (open > 0) {
			System.out.println(open);
		} else {
			System.out.println(0);
		}

		sc.close();

	}

}