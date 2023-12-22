import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int n = 1;
		int tap = 0;

		while (n < B) {
			n += A - 1;
			tap++;
		}
		System.out.println(tap);
	}

}
