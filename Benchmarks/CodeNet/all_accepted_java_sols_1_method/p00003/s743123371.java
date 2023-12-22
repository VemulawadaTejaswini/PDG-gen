

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] array = new int[3];
		for (int i = 0; i < a; i++) {
			array[0] = scan.nextInt();
			array[1] = scan.nextInt();
			array[2] = scan.nextInt();
			java.util.Arrays.sort(array);
			int result = (array[2] * array[2])
					- ((array[1] * array[1]) + (array[0] * array[0]));
			if (result == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}