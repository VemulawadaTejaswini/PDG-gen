import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int now = 1;
		for (int i = 0; i < N; i++) {
			now = Math.min(now * 2, now + K);
		}
		
		System.out.println(now);
	}
}
