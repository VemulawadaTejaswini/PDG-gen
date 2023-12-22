import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int T = scanner.nextInt();
		int answer = 0;
		int count = T/A;
		
		answer = B * count;
		System.out.println(answer);
	}
}