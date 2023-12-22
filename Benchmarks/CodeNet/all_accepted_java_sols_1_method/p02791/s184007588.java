import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] pArray = new int[n];
			
			for(int i = 0 ; i < n ; i++) {
				pArray[i] = sc.nextInt();
			}
			
			
			int min = pArray[0];
			int count = 1;
			for(int i = 1 ; i < n ; i++ ) {
				
				if ( pArray[i] < min) {
					//OK
					count++;
					min = pArray[i];
				}
			}

			System.out.println(count);
		}
	}
}