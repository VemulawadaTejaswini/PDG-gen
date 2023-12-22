import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if (a + b < k) System.out.println(0 + " " + 0);
		else if (a - k <= 0) {
			System.out.println(0 + " " + (b + a - k));
		} else {
			System.out.println((a - k) + " " + b);
		}
		
		sc.close();
	}

}
