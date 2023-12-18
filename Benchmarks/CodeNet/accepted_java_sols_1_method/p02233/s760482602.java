import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] fib = new int[n+1];
		fib[0] = 1;
		fib[1] = 1;
		for (int i=2; i<=n; i++) {
			fib[i] = fib[i-1] + fib[i-2]; 
		}
		System.out.println(fib[n]);
	}
}