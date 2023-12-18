import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[] h = new int[N];
			for(int i = 0;i<N;i++) {
				h[i] = scan.nextInt();
			}
			
			Arrays.sort(h);
			
			
			int min = Integer.MAX_VALUE;
			
			for(int i = 0;i<N-(K-1);i++) {
				int hmin = h[i];
				int hmax = h[i+(K-1)];
				
				if((hmax-hmin)<min) {
					min = hmax-hmin;
				}
				
				
			}
			
			System.out.println(min);
			
			
		}
	}
}