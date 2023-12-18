import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int X = scanner.nextInt();
		int Y = scanner.nextInt();

		int result = K*X+(N-K)*Y;
		if(N<K) result = N*X;
		System.out.println(result);
		scanner.close();
	}

}
