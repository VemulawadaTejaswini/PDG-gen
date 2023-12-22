import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		int n = stdIn.nextInt(); 
		
		long[] a = new long[n];
		long[] b = new long[n];
		
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextLong();
			b[i] = stdIn.nextLong();
			
			max = Math.max(max, a[i]);
			
		}
		
		
		for(int i = 0; i < n; i++) {
			if(max == a[i]) {
				System.out.println(max + b[i]);
				return;
			}
		}
		
		
		
	}

}
