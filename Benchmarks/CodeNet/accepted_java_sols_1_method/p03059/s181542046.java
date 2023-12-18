import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();

		sc.close();

		int answer = 0;

		for(int i = A ; i < T + 0.5 ;i += A) {
			answer += B;
		}

		System.out.println(answer);
	}

}
