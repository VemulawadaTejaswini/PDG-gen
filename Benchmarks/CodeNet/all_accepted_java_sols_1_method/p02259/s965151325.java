
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int total_element_number = scanner.nextInt();
		int[] data_array = new int[total_element_number];
		for (int i = 0; i < total_element_number; i++) {
			data_array[i] = scanner.nextInt();
		}



		int count = 0;
		//bubbleSort
		int sorted_element_number = -1;
		while(sorted_element_number < (total_element_number - 2)) {
			for (int target = total_element_number - 1; target >= sorted_element_number + 2; target--) {
				//比較して入れ替え
				if(data_array[target - 1] > data_array[target]) {
					int bf = data_array[target - 1];
					data_array[target - 1] = data_array[target];
					data_array[target] = bf;
					count++;
				}
			}
			sorted_element_number++;
		}




		for (int i = 0; i < total_element_number - 1; i++) {
			System.out.print(data_array[i] + " ");
		}
		System.out.println(data_array[total_element_number - 1]);
		System.out.println(count);

	}
}

