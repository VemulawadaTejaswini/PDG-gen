import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		long answer = A%B;
		System.out.println(Math.min(B-answer, answer));
	}
}