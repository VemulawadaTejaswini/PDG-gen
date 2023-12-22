import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];

		for(int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		for(int i = 9; i > 6; i--) {
			System.out.println(array[i]);
		}
	}
}