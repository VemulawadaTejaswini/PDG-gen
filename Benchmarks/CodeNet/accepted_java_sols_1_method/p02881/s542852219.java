import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = N-1;
		for(int i = (int)Math.sqrt(N); i >= 1; i--) {
			if(N % i == 0) {
				ans = i + N/i - 2;
				break;
			}
		}
		System.out.println(ans);

	}

}
