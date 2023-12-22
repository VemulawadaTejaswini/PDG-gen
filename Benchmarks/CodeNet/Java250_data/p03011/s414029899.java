import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		int ans = P + Q;
		if(P + R < ans) {
			ans = P + R;
		}
		if(R + Q < ans) {
			ans = R + Q;
		}
		System.out.println(ans);
		sc.close();
	}

}