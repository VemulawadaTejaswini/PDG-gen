import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long x = (long)Math.min(b - 1, n);
		int res = (int)(a * x / b);
		System.out.println(res);
    }
}