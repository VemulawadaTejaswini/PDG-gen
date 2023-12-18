
import java.util.*;

public class Main {
	
	public static int maxYen(int arr[], int size) {
		int profit = Integer.MIN_VALUE;
		int min = arr[0];
		for(int i = 1; i < size; i++) {
			if(profit < arr[i] - min) profit = arr[i] - min;
			if(min >  arr[i]) min = arr[i];
		}
		return profit;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int time = in.nextInt();
		int[] arr = new int[time];
		for(int i = 0; i < time; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(maxYen(arr, time));
	}
}

