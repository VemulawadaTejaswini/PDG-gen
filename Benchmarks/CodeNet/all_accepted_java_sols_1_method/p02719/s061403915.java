import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		n = n % k;
		
		long m = (k-n);
		
		System.out.println( Math.min(n, m));
		
	}
		

}
