import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num = stdin.nextInt();
		int day = stdin.nextInt() - 1;
		int sum = num + stdin.nextInt();

		for (int i = 0; i < num; i++) {
			sum += day / stdin.nextInt();
		}

		System.out.println(sum);
	}

}
