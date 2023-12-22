import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long max = scan.nextLong();
		long sum = 0;
		
		for(long i = 0; i < n - 1 ; i++) {
			long a = scan.nextLong();
			if(a < max) {
				sum += max - a;
			} else if(max < a){
				max = a;
			}
		}
		
		System.out.print(sum);
	}
}