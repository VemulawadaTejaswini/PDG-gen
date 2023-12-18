import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int values_num = sc.nextInt();
		int[] values = new int[values_num];
		for (int i = 0; i < values_num; i++) {
			values[i] = sc.nextInt();
		}
		int change_counter = bubbleSort(values);
		for(int i = 0; i < values.length; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(values[i]);
		}
		System.out.print("\n");
		System.out.println(change_counter);
	}
	public static int bubbleSort(int[] values) {
		int change_counter = 0;
		boolean hasRevers = true;
		while(hasRevers) {
			hasRevers = false;
			for (int i = values.length - 1; i > 0; i--) {
				if(values[i] < values[i-1]) {
					int tmp = values[i];
					values[i] = values[i-1];
					values[i-1] = tmp;
					hasRevers = true;
					change_counter++;
				}
			}
		}
		return change_counter;
	}
}
