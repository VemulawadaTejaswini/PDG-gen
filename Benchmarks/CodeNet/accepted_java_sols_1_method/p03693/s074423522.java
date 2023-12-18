import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		long g = sc.nextLong();
		long b = sc.nextLong();
		System.out.println((g * 10 + b) % 4 == 0 ? "YES" : "NO");
	}
}