import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long sum = 1;
		for (int i = 0; i < N; i++) {
				sum *= sc.nextLong();
		}
		
		
		if ( sum <= 1000000000000000000L) {
			System.out.println(sum);
		} else {
			System.out.println(-1);
		}
		sc.close();
	}
}
