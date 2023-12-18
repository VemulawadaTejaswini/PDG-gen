import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		for(int i = 0; i < n; i++) {
			int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
			boolean isCorrect = true;

			for(int j = 0; j < 10; j++) {
				int ball = scan.nextInt();
				if(ball > left) {
					left = ball;
				} else if(ball > right) {
					right = ball;
				} else {
					isCorrect = false;
				}
			}

			System.out.println(isCorrect ? "YES" : "NO");
		}

		scan.close();
	}

}
