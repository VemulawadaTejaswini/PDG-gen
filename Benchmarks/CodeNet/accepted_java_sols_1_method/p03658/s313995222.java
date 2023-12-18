import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		Integer[] l = new Integer[N];
		for(int i = 0; i < N; i++) {
			l[i] = stdIn.nextInt();
		}
		Arrays.sort(l, Collections.reverseOrder());
		
		int ans = 0;
		for(int i = 0; i < K; i++) {
			ans += l[i];
		}
		System.out.println(ans);

	}

}