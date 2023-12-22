import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();

		long sum = 0;
		long lt = 0;
		for( int i=0 ; i< (1<<(n-1)) ; i++ ) {
			int bit = i;
			lt = (s.charAt(0)-'0');
			for( int j=1 ; j<n ; j++) {
				if( (bit&1) == 0 ) {
					lt = lt*10 + (s.charAt(j)-'0');
				} else {
					sum += lt;
					lt = (s.charAt(j)-'0');
				}
				bit >>= 1;
			}
			sum += lt;
		}
		
		System.out.println(sum);
	}
		

}

