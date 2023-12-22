import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        n %= k;
        n = Math.min(n,k-n);
        System.out.println(n);
	}
}