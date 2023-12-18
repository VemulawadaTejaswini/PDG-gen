import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int tmp = 0;
		int tmpNum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Sort st = new Sort();
		st.insertionSort(array);
	}
}

class Sort {
	public void insertionSort(int[] array) {
		int j = 0;
		boolean flag = false;
		for (int k = 0; k < array.length - 1; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println(array[array.length - 1]);
		for (int i = 1; i < array.length; i++) {
			j = i - 1;
			while (j >= 0 && array[j + 1] < array[j]) {
				swap(array, j + 1, j);
				j--;
			}
			for (int k = 0; k < array.length - 1; k++) {
				System.out.print(array[k] + " ");
			}
			System.out.println(array[array.length - 1]);
		}
	}
	
	public void swap(int[] array, int a, int b) {
		int tmp = 0;
		tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
