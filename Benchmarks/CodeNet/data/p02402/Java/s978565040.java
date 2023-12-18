import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int max = -1000000;
		int min = 1000000;
		long sum = 0;

		for (int i = 0; i < n; i++) {
			int temp = stdIn.nextInt();
			if (temp > max) {
				max = temp;
			}
			if (temp < min) {
				min = temp;
			}
			sum += temp;
		}

		System.out.println(min + " " + max + " " + sum);

		stdIn.close();
	}
}