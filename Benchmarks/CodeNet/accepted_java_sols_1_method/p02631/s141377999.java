import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		int n = stdIn.nextInt();
		long[] a = new long[n];
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextLong();
			ans ^= a[i];
		}
		
		
		for(int i = 0; i < n; i++) {
			System.out.print((ans ^ a[i])+" ");
		}
		
		
	}

}
