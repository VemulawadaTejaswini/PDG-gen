import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] a = new int[N+1];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			a[A[i]]++;
		}
		long ans = 0L;
		for (int i = 0; i <= N; i++) {
			long x = a[i];
			ans += x*(x-1)/2;
		}

		for (int i = 0; i < N; i++) {
			long temp = ans;
			long x = a[A[i]];
			if (x >= 2) {
				temp -= x*(x-1)/2;
				temp += (x-1)*(x-2)/2;
			}
			System.out.println(temp);
		}
	}

}