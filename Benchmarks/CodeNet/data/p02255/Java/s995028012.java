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
		
		for(int ans: a) {
			System.out.print(ans + " ");
		}
		System.out.println();

		for(int i = 1; i < n; i++) {
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && temp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
			for(int ans: a) {
				System.out.print(ans + " ");
			}
			System.out.println();
		}
	}
}

