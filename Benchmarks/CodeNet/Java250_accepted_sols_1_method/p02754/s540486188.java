import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		System.out.println((long) Math.floor(n / (a + b)) * a + Math.min(n % (a + b), a));
	}
}