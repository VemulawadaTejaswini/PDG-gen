public class Main {
	
	public static void sort(int n, int [] arr) {
		
		int j;
		
		for(int t = 0; t < n; t++) {
			System.out.print(arr[t] + " ");
		}
		
		System.out.println("");
		
		for(int i = 1; i < n; i++) {
			
			int key = arr[i];
			j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key;
			
			for(int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			
			System.out.println("");
		}
	}
	
	
	public static void main(String [] args) {
		sort(6, new int [] {5, 2, 4, 6, 1, 3});
	}
}
