import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int result = 1;
		for (int i = 0; i < N; i++) {
			if (result * 2 < result + K) {
				result *= 2;
			} else {
				result += K;
			}
		}
		
		System.out.println(result);
	}
}