import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int H = scan.nextInt();
	int W = scan.nextInt();
	int count = 0;

	for (int i = 0; i < N; i++) {
		int A = scan.nextInt();
		int B = scan.nextInt();

		if (A >= H && B >= W) {
			count++;
		}
	}

	System.out.println(count);

	}
}
