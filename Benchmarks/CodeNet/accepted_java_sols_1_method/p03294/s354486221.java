import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		BigInteger key = BigInteger.ONE;
		for (int i = 0; i < N; i++) {
			key = key.multiply(BigInteger.valueOf(map[i]));
		}
		key = key.subtract(BigInteger.ONE);
		
		BigInteger ans = BigInteger.ZERO;
		for (int j = 0; j < N; j++) {
			ans = ans.add(key.remainder(BigInteger.valueOf(map[j])));
		}
		System.out.println(ans);
	}
	
}