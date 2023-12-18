import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		int outputMax = 0;
		for (int i = a; i < a + k && i <= b ; i++) {
			outputMax = i;
			System.out.println(i);
		}

		int minOfRight = b - k + 1;
		if (minOfRight <= outputMax) minOfRight = outputMax + 1;
		for (int i = minOfRight; i <= b; i++) {
			System.out.println(i);
		}

		sc.close();
	}
}