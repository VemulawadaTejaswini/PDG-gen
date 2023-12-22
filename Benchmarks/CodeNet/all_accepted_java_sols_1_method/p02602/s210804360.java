import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int K = Integer.valueOf(s.next());
		int[] A = new int[N];
		BigInteger cur = BigInteger.ONE;
		BigInteger former = BigInteger.ONE;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			A[i] = Integer.valueOf(s.next());
			cnt++;
			if(cnt <= K) {
//				cur = cur.multiply(BigInteger.valueOf(A[i]));
			}else {
//				former = cur;
//				cur = cur.multiply(BigInteger.valueOf(A[i])).divide(BigInteger.valueOf(A[i-K]));
				if(A[i] > A[i-K]) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
	}
}