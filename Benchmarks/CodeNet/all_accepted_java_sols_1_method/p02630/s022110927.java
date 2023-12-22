import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int[] A = new int[100010];
		long ans = 0;
		
		for(int n = 0; n<N; n++) {
			int a = keyboard.nextInt();
			A[a]++;
			ans += a;
		}
		
		int Q = keyboard.nextInt();
		
		for(int q = 0; q<Q; q++) {
			int b = keyboard.nextInt();
			int c = keyboard.nextInt();
			//掛け算してLongになるとき、先頭にLongの形式で1をかけておくと、型がlongになる
			ans += 1L*c*A[b];
			ans -= 1L*b*A[b];
			
			A[c] += A[b];
			A[b] = 0;
			
			System.out.println(ans);
		}
		
		keyboard.close();
	}
}
