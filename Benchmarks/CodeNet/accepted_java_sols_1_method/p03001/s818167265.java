import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		System.out.println((double)W*H/2 + " " + (x*2==W && y*2==H ? 1 : 0));
		sc.close();
	}
}