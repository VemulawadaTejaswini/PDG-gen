import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		while (true) {
			if (A == B || C == 0) {
				System.out.println(C);
				break;
			}
			B++;
			C--;
		}
	}
}