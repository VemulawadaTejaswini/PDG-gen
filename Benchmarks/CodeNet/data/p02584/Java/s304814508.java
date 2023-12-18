import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();
		long min = Long.MAX_VALUE;
		
		for(int i=0;i<k+1;i++) {
			long n = x;
			n = n - (d*i);
			n = n + (d*(k-i));
			min = Math.min(min, Math.abs(n));
		}
		System.out.println(min);

	}

}
