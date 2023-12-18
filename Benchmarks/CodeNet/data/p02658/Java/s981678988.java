
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long sum = 1;
		long max = 1000000000000000000l;
		boolean chk = false;
		
		for(int i = 0; i < n; i++) {
			if( max / sum < a[i]) {
				chk = true;
			}
			if(a[i] == 0) {
				sum = 0;
			}else {
				sum*= a[i];
			}
		}
		
		if( sum == 0 ) {
			System.out.println(0);
		}else if( chk ){
			System.out.println(-1);
		}else {
			System.out.println(sum);
		}
	}
}