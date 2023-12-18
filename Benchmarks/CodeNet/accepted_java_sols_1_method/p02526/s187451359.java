

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, q, count = 0;
		boolean[] a = new boolean[10000001];
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			a[scan.nextInt()] = true;
		}
		q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			if(a[scan.nextInt()]) {
				count++;
			}
		}
		System.out.println(count);
	}
}