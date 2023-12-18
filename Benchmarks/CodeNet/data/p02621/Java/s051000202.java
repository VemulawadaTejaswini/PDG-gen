import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = (long)Math.pow(a, 2);
		long c = (long)Math.pow(a, 3);
		System.out.println(a + b + c);
	}
}