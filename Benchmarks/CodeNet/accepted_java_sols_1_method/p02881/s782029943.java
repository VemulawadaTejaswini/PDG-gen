import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = 0;
		for(long i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				a = (i-1) + (n / i - 1);
			}
		}
		System.out.println(a);
     }
}