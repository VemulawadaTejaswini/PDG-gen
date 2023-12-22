import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long x = Math.abs(s.nextLong());
		long k = s.nextLong();
		long d = s.nextLong();
		
		long ans = x/d;
		if(ans>k) {
			System.out.println(x-k*d);
		}
		else {
			k-=ans;
			if(k%2==0) {
				System.out.println(x-ans*d);
			}
			else {
				System.out.println(Math.abs(x-ans*d-d));
			}
		}
		
		
	}
}
