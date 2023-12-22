import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for( int i= 0; i<n ; i++ ) {
			a[i] = sc.nextInt();
		}
		
		int pmax = a[0];
		long s = 0;
		for( int i= 1; i<n ; i++ ) {
			int d = pmax - a[i];
			if( d >= 0 ) {
				s += d;
			}else {
				pmax = a[i];
			}
			
		}
		
		System.out.println(s);
	}
}

