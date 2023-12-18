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

	static int[] bubbleSort(int[] a, int n) {
		int flg = 1;
		int cnt = 0;
		while(flg == 1){
			flg = 0;
			for(int j = n - 1 ; j >= 1 ; j--) {
				if(a[j] < a[j - 1]) {
					int v = a[j];
					a[j] = a[j - 1];
					a[j - 1] = v;
					flg = 1;
					cnt++;
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
		return a;
	}

}