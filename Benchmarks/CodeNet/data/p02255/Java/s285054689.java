import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];
		
		for (int i = 0; i < n; i++ ) {
			array[i] = scan.nextInt();
			System.out.print(array[i]);
			if ( i == n - 1) break;
			System.out.print(" ");
		}
		System.out.println();
		scan.close();
		

		
		for (int i = 1; i < n; i++) {
			int v = array[i];
			int j = i - 1;
			
			while ( j >= 0 && array[j] > v) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = v;
			
			for (int k = 0; k < n; k++ ) {
				if ( k == n - 1) {
					System.out.println(array[k]);
				} else {
					System.out.print(array[k] + " ");
				}
				
			}
		}
		
	}
}

