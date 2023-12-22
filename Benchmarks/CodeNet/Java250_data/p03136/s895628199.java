import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] n = new int[a];

		for (int i = 0; i < a; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		int sum = 0;
		for (int i = 0; i < a - 1; i++) {
			sum += n[i];
		}
		if (n[a - 1] < sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
