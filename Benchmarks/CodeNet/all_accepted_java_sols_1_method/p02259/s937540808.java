import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = n - 1; i > 0; i--) {
			int j = 0;
			while(j < i) {
				if(arr[j] > arr[j + 1]) {
					int v = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = v;
					count++;
				}
				j++;
			}
		}
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(count);
	}
}

