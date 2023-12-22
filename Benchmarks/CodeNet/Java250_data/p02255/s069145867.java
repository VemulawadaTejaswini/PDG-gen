import java.util.Scanner;

public class Main {
	public static boolean debug =  true;
	
	public static void print_arr(int [] arr) {
		int i = 0;
		while(i < arr.length) {
			System.out.print(arr[i]);
			if(i < arr.length-1) {
				System.out.print(" ");
			}else {
				System.out.print("\n");
			}
			i++;
		}
	}
	
	public static void insertion_sort(int [] arr) {
		for(int i = 1; i < arr.length;  i++) {
			if(debug) {
				print_arr(arr);
			}
			int j = i - 1;
			int key = arr[i];
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;

		}
		
		if(debug) {
			print_arr(arr);
			
		}
	
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = 0;
		
		n = cin.nextInt();
		
		int [] arr = new int[n];
		
		int x_i = 0;
		
		for(int i = 0; i < n; i++) {
			x_i = cin.nextInt();
			arr[i] = x_i;
		}
		
		insertion_sort(arr);
		
	
	}
}