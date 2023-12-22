import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
		// First input needs to be length
		int length = in.nextInt();
	
		// Create an array with that length
		int[] a = new int[length];
		
		// Fill in that array with the second input
		for (int i = 0; i < length; i++) {
			a[i] = in.nextInt();
		}
		
		// Prints the unsorted Array
		print(a);
		System.out.println();
		
		//Now time to sort it
		for (int i = 1; i < length; i++) {
			// the value of this specific index
			int ind = a[i];
			// index for the number before the index (i) now
			int j = i -1;
			// WHILE j is positive and it's value is greater than ind...
			while(j>=0 && a[j] > ind) {
				// The value will be pushed down away from ind
				a[j+1] = a[j];
				j = j-1;
			}
			// if they find a value less, than the ind is pushed so that value is before it
			a[j+1] = ind;
			//Show the array as it's sorted
			print(a);
			System.out.println();
		}
	
	
	}
	
	public static void print(int[] nums) {
		
		
		for (int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i]);
			System.out.print(" ");
		}
		System.out.print(nums[nums.length-1]);	
	}
	
}

