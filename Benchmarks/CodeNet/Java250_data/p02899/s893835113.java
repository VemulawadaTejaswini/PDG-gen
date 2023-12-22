import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		int a[][] = new int[2][n];
		
		for (int i = 0; i < n; i++) {
			a[0][i] = sc.nextInt();
			a[1][i] = i + 1;
		}
		
		//ソートする([0]の値でソート)
		//sort(a, n);
		quickSort(a, 0, n - 1);
		
		for (int i = 0; i < n; i++) {
			System.out.print( a[1][i] + " " );
		}
		
		return;
	}
	
	public static void sort(int array[][], int n) {
	
		if (array == null) {
			return;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				if (array[0][j] < array[0][j-1]) {
					int temp0 = array[0][j];
					int temp1 = array[1][j];
					
					array[0][j] = array[0][j-1];
					array[1][j] = array[1][j-1];
					
					array[0][j-1] = temp0;
					array[1][j-1] = temp1;
				}
			}
		}

		return;
	}
	
	
	public static void quickSort(int array[][], int left, int right) {
	
		
		if ( left > right ) {
			return;
		}
		
		
		int pivotValue = array[0][(left + right) / 2];
		
		int i = left;
		int j = right;
		
		while ( i <= j ) {
			while (array[0][i] < pivotValue) {
				i++;
			}
			
			while (array[0][j] > pivotValue) {
				j--;
			}
			
			if ( i <= j ) {
				quickSortSwap(array, i, j);
				
				i++;
				j--;
			}
		}
		
		quickSort(array, left, j);
		quickSort(array, i, right);
	}
		
	
	
	
	
	public static void quickSort2(int array[][], int left, int right){
	
		if ( left < right ) {
			int pivot = quickSortPartition( array, left, right );
			
			quickSort(array, left, pivot - 1);
			quickSort(array, pivot + 1 , right);
		}
	}
	
	public static int quickSortPartition(int array[][], int left, int right) {

		// 基準は左端の値とする
		int pivot = left;
		int pivotValue = array[0][pivot];
		
		//left ～ rightの間を大小比較
		int min = left + 1;
		int max = right;
		int i = min;
		int j = max;
		
		
		while ( i <= j ) {
			while ( i < max && i < j && array[0][i] < pivotValue ) {
				i++;
			}
			while ( j > min && i < j && pivotValue <= array[0][j] ) {
				j--;
			}
			
			if ( i <= j && array[0][i] > array[0][j]) {
				quickSortSwap(array, i, j);
				i++;
				j--;
			}
		}
		
		
		
		
		
		//最後 j が進んだ位置がpivot値が入る位置
		quickSortSwap(array, pivot, j);
		pivot = j;
		
//		String temp = "";
//		temp += "pivotValue:" + pivotValue;
//		temp += ", i:" + i + ", j:" + j + ", left:" + left + ", right:" + right;
//		if ( left <= i && i <= right ) { temp += ", array[i]:" + array[0][i]; }
//		if ( left <= j && j <= right ) { temp += ", array[j]:" + array[0][j]; }
//
//		temp += "***";
//		for (int x = left; x <= right; x++) {
//			temp += array[0][x] + "\t";
//		}
//
//		System.out.println(temp);
		
		return pivot;
	}
		
		
		
	public static void quickSortSwap(int array[][], int i, int j) {
		int temp0 = array[0][i];
		int temp1 = array[1][i];
		
		array[0][i] = array[0][j];
		array[1][i] = array[1][j];
		
		array[0][j] = temp0;
		array[1][j] = temp1;
		
		return;
	}

}