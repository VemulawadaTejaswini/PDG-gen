import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_1_A(); 
	}
	public static void ALDS1_1_A() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == n - 1) {
					System.out.print(a[j]);
				}else {
					System.out.print(a[j] + " ");
				}
			}
			System.out.println();
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && temp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}

		for(int j = 0; j < n; j++) {
			if(j == n - 1) {
				System.out.print(a[j]);
			}else {
				System.out.print(a[j] + " ");
			}
		}
		System.out.println();
	}
}
