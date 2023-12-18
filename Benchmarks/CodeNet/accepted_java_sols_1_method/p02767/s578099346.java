import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int[] xArray = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				xArray[i] = sc.nextInt();
			}
			
			int minE = Integer.MAX_VALUE;
			for(int i = 1 ; i <= 100 ; i++ ) {
				
				int e = 0;
				for(int j = 0 ; j < n ; j++ ) {
					e += (int)Math.pow(xArray[j] - i, 2);
				}
				if ( e < minE ) {
					minE = e;
				}
			}
			
			System.out.println(minE);
			
		}
	}
}