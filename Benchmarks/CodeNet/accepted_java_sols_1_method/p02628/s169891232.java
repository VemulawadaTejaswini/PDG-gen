import java.util.Arrays;
import java.util.Scanner;

// ABC171-B
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] fruitList = new int[N];
		for (int i = 0; i < N; i++) {
			fruitList[i] = sc.nextInt();
		}
		Arrays.sort(fruitList);

		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum += fruitList[i];
		}

		System.out.println(sum);
		sc.close();
	}
}
