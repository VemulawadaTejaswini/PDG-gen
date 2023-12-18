import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long k = input.nextLong();
 
        long ans = 0;
 
		if (k % 2 == 0) {
			ans = a - b;
 
		} else {
			ans = b - a;
		}
 
		System.out.println(Math.pow(10, 18) < Math.abs(ans) ? "Unfair" : ans);
    }
}