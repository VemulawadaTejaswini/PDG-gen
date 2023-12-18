import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] l = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				l[i] = sc.nextInt();
			}
			
			Arrays.sort(l);
			
			int result = 0;
			
			for( int i = 0 ; i < n ; i++ ) {
				for( int j = i+1 ; j < n - 1; j++ ) {
					int a = l[i];
					int b = l[j];
					int gap = b - a;
					
					boolean found = false;
					for(int k = j+1 ; k < n ; k++ ) {
						int c = l[k];
						if ( c > gap) {
							found = true;
						}
						if ( found ) {
							if ( c < a + b ) {
								result++;
							}
							else {
								break;
							}
						}
					}
				}
			}
			
			System.out.println(result);
			
		}
	}
}