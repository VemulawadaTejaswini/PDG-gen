import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			a1[i] = a2[i] = a;
		}
		
		Arrays.sort(a2);
		
		for (int i = 0; i < n; i++) {
			int max = a1[i] == a2[n - 1] ? a2[n - 2] : a2[n - 1];
			System.out.println(max);
		}
		
	}
}
