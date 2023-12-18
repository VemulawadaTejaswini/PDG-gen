import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double h = scan.nextLong();
		h = Math.log(h) / Math.log(2);
		long n = (long)h;
		
		double x = Math.pow(2,n+1);
		long ans = (long)x;
		System.out.println(ans-1);
		
	}
}


