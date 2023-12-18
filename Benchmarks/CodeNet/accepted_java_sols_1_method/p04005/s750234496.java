import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		long C = input.nextLong();
		if (A%2==0||B%2==0||C%2==0) System.out.println(0);
		else {
			long answer = A*B;
			answer = Math.min(A*C, answer);
			answer = Math.min(B*C, answer);
			System.out.println(answer);
		}
	}
}