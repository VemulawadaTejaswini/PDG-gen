
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < n; i++) {
			price[i] = scan.nextInt();
		}

		Arrays.sort(price);
		int sum = 0;
		for (int i = 0; i < price.length; i++) {
			if (i == price.length - 1)
				sum += price[i] / 2;
			else
				sum += price[i];
		}
		System.out.println(sum);
	}
}