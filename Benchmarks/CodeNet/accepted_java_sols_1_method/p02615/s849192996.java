import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		long ans = 0;
		boolean ok = true;
		int j = N-1;
		for(int i = 0; i < N-1; i++) {
			ans += A[j];
			if(ok) {
				j--;
				ok = false;
			}
			else
				ok = true;
		}
		System.out.println(ans);
	}

}