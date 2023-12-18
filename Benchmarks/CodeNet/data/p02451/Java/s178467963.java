import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				/* 返り値に注意*/
				int loc = Arrays.binarySearch(a, sc.nextInt());
				System.out.println(loc < 0 ? "0" : "1");
			}
		}
	}
}

