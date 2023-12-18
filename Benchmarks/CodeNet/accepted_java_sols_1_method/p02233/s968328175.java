import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.close();
		
		int[] fib = new int[n + 1];
		for (int i = 0; i <= n; i ++) {
			fib[i] = (i < 2) ? 1: fib[i - 1] + fib[i - 2];
		}
		
		System.out.println(fib[n]);
	}
} 

