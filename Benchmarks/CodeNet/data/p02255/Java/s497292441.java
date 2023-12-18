
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int total_element = scanner.nextInt();
		int[] data_array = new int[total_element];
		for (int i = 0; i < total_element; i++) {
			data_array[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < total_element - 1; i++) {
			System.out.print(data_array[i] + " ");
		}
		System.out.println(data_array[total_element - 1]);
		//insertionSort
		int sorted_element = 0;
		for (int target = 1; target < total_element; target++) {
			int judge_target_low = target - 1;
			int judge_target_high = target;


			while(judge_target_low >= 0) {
				if(data_array[judge_target_low] > data_array[judge_target_high]){
					int bf = data_array[judge_target_low];
					data_array[judge_target_low] = data_array[judge_target_high];
					data_array[judge_target_high] = bf;
					judge_target_high--;
					judge_target_low--;
				} else {
					break;
				}
			}
			sorted_element = target;


			for (int i = 0; i < total_element - 1; i++) {
				System.out.print(data_array[i] + " ");
			}
			System.out.println(data_array[total_element - 1]);
		}



	}
}

