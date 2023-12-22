import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();

		int result = 0;
		if (N>K) {			
			result = X*K;
			result += Y*(N-K);
		} else {
			result = X*N;
		}
		System.out.println(result);
	}

}
