import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbers[] = new int[n];
		int min, max, sum = 0;
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		min = numbers[0];
		max = numbers[0];

		for (int i = 1; i < n; i++) {
			if (min > numbers[i])
				min = numbers[i];

			if (max < numbers[i])
				max = numbers[i];
		}

		String output = min + " " + max + " " + sum;

		System.out.println(output);

	}

}