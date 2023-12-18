import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		long[] flag = new long[200001];
		Arrays.fill(flag, 0);
		
		for(int i = 0; i < N; i++) {
			int A = stdIn.nextInt();
			flag[A]++;
		}
		
		Arrays.sort(flag);
		long ans = 0;
		for(int i = 0; i < 200001-K; i++) {
			ans += flag[i];
		}
		
		System.out.println(ans);

	}

}