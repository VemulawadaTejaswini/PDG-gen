import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		bubbleSort(a, n);
	}

	static void bubbleSort(int[] a, int n) {
		boolean flg = true;
		int cnt = 0;
		while(flg) {
			flg = false;
			for(int j = n - 1 ; j >= 1 ; j--) {
				if(a[j - 1] > a[j]) {
					int v = a[j - 1];
					a[j - 1] = a[j];
					a[j] = v;
					cnt++;
					flg = true;
				}
			}
		}
		for(int i = 0 ; i < n ; i++) {
			if(i != n - 1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.println(a[i]);
			}
		}
		System.out.println(cnt);
	}

}