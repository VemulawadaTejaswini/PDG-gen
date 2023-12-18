import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long n = 0;
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextLong();		
		long[] a = new long[1000000];
		for (int i = 0; i < n; i++) {
			a[i] = stdin.nextLong();
		}
		
		long max = a[0];
		for (int i = 1; i < a.length; i++) {
	        if (a[i] > max) {
	        	max = a[i];
	        }
	    }
		long min = a[0];
		for (int i = 1; i < a.length; i++) {
	        if (a[i] < min) {
	        	min = a[i];
	        }
	    }
		long sum = a[0];
		for (int i = 1; i < a.length; i++) {	       
	        	sum += a[i];
	    }
		
		System.out.println(min+ " " + max + " " + sum);
	}
}