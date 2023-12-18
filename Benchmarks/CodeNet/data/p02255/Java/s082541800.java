package topic01;

import java.util.Scanner;

class InsertionSort {
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array;
		
		int n = sc.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		doInsertionSort(array);
		
		printArray(array);
		
		return 0;
	}
	public static void doInsertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {

			printArray(array);

			int val = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > val) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = val;
		}
	}
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i != 0) 
				System.out.print(" ");
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}
}