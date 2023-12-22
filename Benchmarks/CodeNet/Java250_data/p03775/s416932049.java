import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k  = n;
		int countn = 1;
		while(k >= 10) {
			k = k /10;
			countn++;
		}
		int min = countn ;

		for( long i = 1; i < n; i++) {
		 int dig = 1;
		 long j = n / i;
		 
		 if(i > j)  break;
		 
		 if(n % i == 0) {
			 long jj = j;
			while(jj >= 10) {
				dig++;
				jj = jj /10;
			}
			min = Math.min(dig, min);
		}
	}
		System.out.println(min);

	}
}
