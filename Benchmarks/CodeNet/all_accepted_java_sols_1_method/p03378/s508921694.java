import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int costL = 0;
		int costR = 0;

		for(int i = 0; i < M; i++) {
			int tmp = sc.nextInt();
			if(tmp < X) {
				costL++;
			} else {
				costR++;
			}
		}

		System.out.println(Math.min(costL,costR));

	}

}
