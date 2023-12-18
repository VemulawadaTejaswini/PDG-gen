import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());
		
		int minSum = Integer.MAX_VALUE;
		for (int num = -100; num <= 100; num++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int abs = Math.abs(num - a[i]);
				sum += abs* abs;
			}
			minSum = Math.min(minSum, sum);
		}
		
		System.out.println(minSum);
		
		sc.close();
	}
}

