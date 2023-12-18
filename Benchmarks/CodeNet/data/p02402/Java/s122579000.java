import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(in.next());
		}
		
		Arrays.sort(a);
		int min = a[0];
		int max = a[n - 1];
		long total = 0;
		for (int x : a) {
			total += (long)x;
		}
		
		System.out.println(min + " " + max + " " + total);
	}
}	
