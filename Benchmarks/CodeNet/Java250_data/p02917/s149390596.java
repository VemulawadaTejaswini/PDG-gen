import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[n+1];
			
			b[0] = Integer.MAX_VALUE;
			b[n] = Integer.MAX_VALUE;
			for(int i = 0 ; i < n - 1 ; i++) {
				b[i+1] = sc.nextInt();
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				a[i] = Math.min(b[i], b[i+1]);
			}
			
			int sum = Arrays.stream(a).sum();
			
			System.out.println(sum);
		}
		
	}
}