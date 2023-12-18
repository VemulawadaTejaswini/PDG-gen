import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long x = stdIn.nextLong();
		long k = stdIn.nextLong();
		long d = stdIn.nextLong();
		
		if((Math.abs(x)+k-1)/k > d) { 
			System.out.println(Math.abs(x) - k*d);
		}else {
			if(x >= 0) {
				long a = x/d;
				long ans = x - a * d;
				ans = Math.min(ans, Math.abs(ans - d));
				System.out.println(ans);
			}else {
				long a = -x/d;
				long ans = Math.abs(x + a * d);
				ans = Math.min(ans, Math.abs(-ans + d));
				System.out.println(ans);
			}
		}
		
	}

}
