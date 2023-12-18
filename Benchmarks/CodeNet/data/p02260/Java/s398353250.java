import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int values_num = sc.nextInt();
		int[] values = new int[values_num];
		for (int i = 0; i < values_num; i++) {
			values[i] = sc.nextInt();
		}

		int change_counter = selectionSort(values);

		for(int i = 0; i < values.length; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(values[i]);
		}
		System.out.print("\n");
		System.out.println(change_counter);
	}
	public static int selectionSort(int[] values) {
		int change_counter = 0;
		for (int i = 0; i < values.length; i++) {
			int min_index = i;
			for(int j = i + 1; j < values.length; j++) {
				if(values[j] < values[min_index]) {
					min_index = j;
				}
			}
			if (min_index != i) {
				int tmp = values[min_index];
				values[min_index] = values[i];
				values[i] = tmp;
				change_counter++;
			}
		}
		return change_counter;

	}
}

