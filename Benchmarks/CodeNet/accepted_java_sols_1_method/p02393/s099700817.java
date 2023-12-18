import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] int_array= new int[3];

		for (int i = 0; i < int_array.length; i++) {
			int_array[i] = sc.nextInt();
			}

		Arrays.sort(int_array);

		for (int i = 0; i < int_array.length; i++) {
			if (i == int_array.length - 1) {
				System.out.println(int_array[i]);
			} else {
				System.out.print(int_array[i] + " ");
			}
		}
	}
}

