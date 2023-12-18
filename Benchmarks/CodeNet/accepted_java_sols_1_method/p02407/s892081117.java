import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			ar[i] = x;
		}
		System.out.print(ar[n-1]);
		for (int i = n - 2; i >= 0; i--) {
			System.out.print(" " + ar[i]);
		}
		System.out.println();
	}
}