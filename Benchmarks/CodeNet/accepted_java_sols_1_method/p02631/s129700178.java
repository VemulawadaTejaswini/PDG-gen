import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long a[] = new long[n];
		
		long xor = 0;
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
			xor = xor^a[i];
		}
		
		for(int i=0;i<n;i++) {
			System.out.print((xor^a[i])+" ");
		}
		System.out.println();
	}

}
