import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int N[] = new int[a];
		int b = sc.nextInt();
		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
		}

		Arrays.sort(N);
		int sum = 0;


		for (int i = 0; i < b; i++) {
			sum += N[i];
		}

		System.out.println(sum);
		sc.close();

	}
}