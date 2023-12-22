import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong(), n = in.nextLong();
		long x = Math.min(n, b-1);
		System.out.println((a*x/b) - a*(x/b));
	}
}
