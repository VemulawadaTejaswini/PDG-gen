import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value[];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			value = new int[n];
			int sum = 0;
			int max = 0;
			int min = 1000;
			for (int i = 0; i < value.length; i++) {
				value[i] = sc.nextInt();
				sum += value[i];
				if (max < value[i]) {
					max = value[i];
				}
				if (min > value[i]) {
					min = value[i];
				}
			}
			sum = sum - max - min;
			int average = 0;
			average = sum / (n - 2);
			System.out.println(average);
		}
	}
}