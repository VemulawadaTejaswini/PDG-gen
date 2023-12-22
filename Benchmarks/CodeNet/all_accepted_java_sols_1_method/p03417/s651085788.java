import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		sc.close();

		if(N == 1 && M == 1) {
			System.out.print(1);
		} else if(N == 1 && 1 < M) {
			System.out.print(M-2);
		} else if(M == 1 && 1 < N) {
			System.out.print(N-2);
		} else {
			System.out.print((N-2)*(M-2));
		}
	}
	
}