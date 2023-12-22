import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
		}

		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (array[j - 1] < array[j]) {
					int box = array[j - 1];
					array[j - 1] = array[j];
					array[j] = box;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
	}
}