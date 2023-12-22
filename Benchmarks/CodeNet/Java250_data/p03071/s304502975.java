import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i < 2; i++) {
			if(A < B) {
				sum += B;
				B -= 1;
			} else {
				sum += A;
				A -= 1;
			}
		}
		System.out.println(sum);
	}
}
