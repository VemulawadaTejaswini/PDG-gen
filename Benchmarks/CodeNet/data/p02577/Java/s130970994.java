import java.util.*;

public class Main{
	public static void main(String args[]) {
		
		Scanner ob = new Scanner(System.in);
		long N = ob.nextInt();
		long sum = 0;
		
		while(N > 0) {
			long i = N % 10;
			N /= 10;
			sum += i;
		}
		System.out.println((sum % 9 == 0) ? "Yes" : "No");
		ob.close();
	}
}
