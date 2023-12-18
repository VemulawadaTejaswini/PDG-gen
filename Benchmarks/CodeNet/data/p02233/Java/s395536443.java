import java.util.Scanner;


public class Main {
	
	private static int[] cache = new int[44 + 1];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		
		int ret = fibonacciNum(n);
		
		System.out.println(ret);
		
         sc.close();
	}
	
	private static int fibonacciNum(int n) {
		if (cache[n] != 0) {
			return cache[n];
		}
		
		if (n == 0) {
			cache[n] = 1;
			return 1;
		} else if (n == 1) {
			cache[n] = 1;
			return 1;
		} else {
			cache[n] = fibonacciNum(n - 1) + fibonacciNum(n - 2);
			return cache[n];
		}
	}
}