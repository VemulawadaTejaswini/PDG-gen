import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] numbers = new int[num];
		int max = -1000001;
		int min = 1000001;
		int sum = 0;
		for (int i = 0; i < num; i++) {
			numbers[i] = scan.nextInt();
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min > numbers[i]) {
				min = numbers[i];
			}
			sum = sum + numbers[i];
		}
		System.out.print(min + " " + max + " " + sum);
	}
}