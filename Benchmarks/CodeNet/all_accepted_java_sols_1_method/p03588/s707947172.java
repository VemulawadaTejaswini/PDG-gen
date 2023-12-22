import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int worst = 0;
		int maxPlayer = 0;

		for (int i=0; i<N; i++){
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (worst < A){
				worst = A;
				maxPlayer = A + B;
			}
		}
		System.out.println(maxPlayer);
	}
}
