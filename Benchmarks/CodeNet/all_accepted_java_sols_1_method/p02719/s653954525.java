import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long n = sc.nextLong();
			long k = sc.nextLong();
			
			long residual = n % k;
			
			long minus = k - residual;
			
			if ( residual < minus ) {
				System.out.println(residual);
			}
			else {
				System.out.println(minus);
			}
		}
	}

}