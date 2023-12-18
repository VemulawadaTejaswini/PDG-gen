import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		
		System.out.println(Math.min(B-1, N)*A/B);
		sc.close();
	}
}
