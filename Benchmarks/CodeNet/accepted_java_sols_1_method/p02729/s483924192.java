import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		sc.close();

		if(N != 0 && M != 0) {
			int answer = N * (N - 1) / 2 + M * (M - 1)/2;
			System.out.println(answer);
		}else if( N == 0) {
			System.out.println(M * (M - 1)/2);
		}else if( M == 0) {
			System.out.println(N * (N - 1)/2);
		}
	}
}