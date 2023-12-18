import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long ans = 0;
		if(B <= N)
			ans = A*(B-1)/B;
		else
			ans = A*N/B;
		System.out.println(ans);
	}

}
