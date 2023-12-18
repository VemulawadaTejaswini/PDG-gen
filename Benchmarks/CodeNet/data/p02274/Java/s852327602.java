import java.util.Scanner;

class Main {
	static int count = 0;
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int[] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		scan.close();
		
		MergeSort (data, 0, n);
		
		System.out.println(count);
	}
	
	static void MergeSort (int[] data, int left, int right) {
		
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			
			MergeSort(data, left, mid);
			MergeSort(data, mid, right);
			
			Merge(data, left, mid, right);
			
		}
	}
	
	static void Merge (int[] data, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		final int INFTY = 1000000000;
		
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		
		for (int i = 0; i < n1; i++) {
			L[i] = data[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = data[mid + i];
		}
		
		L[n1] = INFTY;
		R[n2] = INFTY;
		
		int i = 0, j = 0;
		int k = left;
		
		while (true) {
			
			if (i == n1 && j == n2) break;
			
			if (L[i] <= R[j]) {
				data[k] = L[i];
				i++;
			} else {
				count += (n1 - i);
				data[k] = R[j];
				j++;
			}
			k++;
		}
		
	}
}

