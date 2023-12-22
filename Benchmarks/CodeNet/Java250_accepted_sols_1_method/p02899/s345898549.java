import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			int[] orders = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				int order = sc.nextInt();
				orders[order-1] = i+1;
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				if ( i > 0 ) {
					System.out.print(" ");
				}
				System.out.print(orders[i]);
			}
		}
	}
}
