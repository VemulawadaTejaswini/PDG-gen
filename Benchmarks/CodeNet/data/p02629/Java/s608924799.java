import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		String answer = "";

		while (N > 0) {
			N--;
			answer = (char) ('a' + (N % 26)) + answer;
			N = N / 26;
		}

		System.out.println(answer);
	}

}