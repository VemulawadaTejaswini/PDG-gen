import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int[] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		scan.close();
		
		Main obj = new Main();
		obj.MergeSort (data, 0, n - 1);
		
	}
	
	void MergeSort (int[] data, int left, int right) {
		
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			
			MergeSort(data, left, mid);
			MergeSort(data, mid + 1, right);
			
			Merge(data, left, mid, right);
			
		}
	}
	
	void Merge (int[] data, int left, int mid, int right) {
		int n = data.length;
		int n1 = mid - left;
		int n2 = right - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			L[i] = data[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = data[mid + i];
		}
		
		int i = 0, j = 0;
		int k = left;
		
		while ( i < n1 && j < n2 && k < n) {
			if (L[i] <= R[j]) {
				data[k] = L[i];
				i++;
			} else {
				data[k] = R[j];
				j++;
			}
			k++;
		}
		
		while (i < n1 && k < n) {
			data[k] = L[i];
			i++;
			k++;
		}
		
		while (j < n2 && k < n) {
			data[k] = R[j];
			j++;
			k++;
		}
		
		
		
		
	}

	static void printArray (int[] data) {
		int n = data.length;
		for (int i = 0; i < n; i++) {
			if ( i != n - 1) System.out.print(data[i] + " "); 
			else System.out.println(data[i]);
		}
	}
}
