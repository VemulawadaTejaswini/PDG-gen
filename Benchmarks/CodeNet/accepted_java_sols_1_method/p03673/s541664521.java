import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] ary = new int[500000];
		int left = 250000;
		int right = left + 1;
		for(int i = 0 ; i < n ; i++) {
			if((n + 1) % 2 == i % 2) {
				ary[left--] = a[i];
			} else {
				ary[right++] = a[i];
			}
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.print(ary[left + i + 1] + " ");
		}
	}
}
