import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			long[] a = new long[n+1];
			long[] b = new long[n];
			
			for(int i = 0 ; i < n+1; i++ ) {
				a[i] = sc.nextInt();
			}
			for(int i = 0 ; i < n ; i++ ) {
				b[i] = sc.nextInt();
			}
			
			long count = 0;
			for(int j = 0 ; j < n ; j++ ) {

				if ( a[j] < b[j]) {
					count += a[j];
					long rest = b[j] - a[j];
					if ( a[j+1] < rest ) {
						count+= a[j+1];
						a[j+1] = 0;
					}
					else {
						count+=rest;
						a[j+1] = a[j+1] - rest;
					}
				}
				else {
					count+= b[j];
				}
			}
			
			System.out.println(count);
		}
	}
}