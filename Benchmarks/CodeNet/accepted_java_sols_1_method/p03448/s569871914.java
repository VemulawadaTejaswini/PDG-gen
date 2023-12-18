import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//500円玉
		int A = scanner.nextInt();
		//100円玉
		int B = scanner.nextInt();
		//50円玉
		int C = scanner.nextInt();
		//ちょうどX円にする
		int X = scanner.nextInt();

		int count = 0;
		for (int a = 0; a <= A; a++) {
			for (int b = 0; b <= B; b++) {
				for (int c = 0; c <= C; c++) {
					if (X == 500*a + 100*b + 50*c) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
