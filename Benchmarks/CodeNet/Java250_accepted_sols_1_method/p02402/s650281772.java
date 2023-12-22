import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		Arrays.sort(a);
		
		long s = 0;
		
		for(int i = 0; i < n; i++) {
			s += a[i];
		}
		
		System.out.println(a[0] + " " + a [n-1] + " " +  s );
	}
}