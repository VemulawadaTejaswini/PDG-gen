import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 1; i < n - 1; i++) {
			if ((array[i] > array[i + 1] && array[i] < array[i - 1]) || (array[i] < array[i + 1] && array[i] > array[i - 1])) {
				++count;
			}
		}
		System.out.println(count);
	}
}
