import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long ans = (N/(A+B))*A;
		ans += Math.min(A, (N%(A+B)));
		System.out.println(ans);
	}
}