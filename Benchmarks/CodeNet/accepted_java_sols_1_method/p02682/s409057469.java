import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int res = 0;

		res += (K >= A) ? A : K;
		K -= A;
		if(K > 0) {
			K-= B;
		}
		if(K > 0) {
			res -= (K >= C) ? C : K;
		}
		System.out.println(res);
	}
}