import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] numbers = new int[num];
		int count = 0;
		while (count < num) {
			numbers[count] = scan.nextInt();
			count++;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		float sum = 0;
		for (int i = 0; i < num; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
			sum += numbers[i];
		}
		System.out.print(min + " " + max);
System.out.format("%.0f", sum);
} 
}



