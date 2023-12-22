import java.util.Scanner;

public class Main {
	public static void print_arr(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(" ");
			}else {
				System.out.print("\n");
			}
			i++;
		}
	}
	public static int bubble_sort(int[] arr) {
		int swap_times = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j >= i+1; j--) {
				// do swapping
				if(arr[j] < arr[j-1]) {
					swap_times++;
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		return swap_times;
		
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		int [] arr = new int[n];
		for(int i = 0;  i < n ; i++) {
			arr[i] = cin.nextInt();
		}
		
		int swap_times = bubble_sort(arr);
		print_arr(arr);
		System.out.println(swap_times);
		
		
		
		
	}
}