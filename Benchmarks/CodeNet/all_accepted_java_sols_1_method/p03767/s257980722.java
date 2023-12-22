import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		Integer[] a = new Integer[3*N];
		for(int i = 0; i < 3*N; i++) {
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		
		long ans = 0;
		for(int i = 1; i < 2*N; i += 2) {
			ans += a[i];
		}
		System.out.println(ans);

	}

}