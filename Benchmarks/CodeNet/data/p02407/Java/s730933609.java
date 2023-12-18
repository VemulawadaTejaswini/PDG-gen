import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		String blank = " ";
		for (int i = array.length-1; i >-1; i--) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + blank);
			}
		}
		System.out.println("");
	}
}