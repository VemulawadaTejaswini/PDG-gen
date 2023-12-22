import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();                
		int K = sc.nextInt();
		int x[] = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		int result = 0;
		for (int i = 0; i < N-K+1; i++) {
			int distance = Math.abs(x[i]) + Math.abs(x[i] - x[i+K-1]);
			if (result == 0 || result > distance) {
				result = distance;
			}
			distance = Math.abs(x[i+K-1]) + Math.abs(x[i+K-1] - x[i]);
			if (result == 0 || result > distance) {
				result = distance;
			}
		}
		System.out.println(result);			
	}	
}
