import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int K = scanner.nextInt();
		scanner.close();

		int max = A + K;
		int min = B - K + 1;
		if(max >= min) {
			for(int i = 0; i <= B - A; i++) {
				System.out.println(A + i);
			}
		}else {
			for(int i = 0; i < K; i++) {
				System.out.println(A + i);
			}
			for(int i = 0; i < K; i++) {
				System.out.println(B - K + i + 1);
			}
		}
	}
}