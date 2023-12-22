import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();

		int ansA = -1;
		int ansB = -1;
		int ansC = -1;

		for (int a = 0; a <= N ; a++) {
			for (int b = 0; a + b <= N; b++) {

				int c = N - a - b;
				int total = 10000*a + 5000*b + 1000*c;

				if(total == Y) {
					ansA = a;
					ansB = b;
					ansC = c;
				}
			}
		}

		System.out.println(ansA);
		System.out.println(ansB);
		System.out.println(ansC);
	}

}
