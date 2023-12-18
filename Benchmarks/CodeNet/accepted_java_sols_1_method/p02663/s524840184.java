import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		int okiruMin = (H1 * 60) + M1;
		int neruMin = (H2 * 60) + M2;
		int okiteruMin = neruMin - okiruMin;
		int answer = 0;
		// System.out.println(okiteruMin);
		if(okiteruMin > 0) {
			answer = okiteruMin - K;
		}
		System.out.println(answer);
	}
}
