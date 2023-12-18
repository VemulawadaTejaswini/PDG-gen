import java.io.PrintStream;
import java.util.Scanner;
public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] =sc.nextInt();
		}
		
		int minSum = Integer.MAX_VALUE;
		for (int i = -100; i <= 100; i++) {
			
			int tempSum = 0;
			for (int j = 0; j < n; j++) {
				tempSum += (i-a[j]) * (i-a[j]);
			}
			minSum = Math.min(tempSum, minSum);
		}
		so.println(minSum);
	}
}
