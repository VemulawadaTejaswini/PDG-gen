import java.util.Scanner;

public class Main { //InsertionSort

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(i == n - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		for(int i = 1; i < n - 1; i++) {
			int j = i - 1;
			int v = arr[i];
			while(j >= 0 && arr[j] > v) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = v;
			for(int k = 0; k < n; k++) {
				if(k == n - 1) {
					System.out.println(arr[k]);
				} else {
					System.out.print(arr[k] + " ");
				}
			}
		}
	}
}

