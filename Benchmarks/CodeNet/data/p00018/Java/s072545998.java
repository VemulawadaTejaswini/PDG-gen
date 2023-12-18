import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// int型配列の表示
	public static void printArray (int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			if (i != 0) System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		Arrays.sort(nums);
		printArray(nums);

	}

}