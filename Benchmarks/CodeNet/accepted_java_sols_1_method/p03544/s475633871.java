import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] L = new long [100];
		L[0] = 2;
		L[1] = 1;
		
		for (int i = 2; i <= N; i++) {
			L[i] = L[i - 2] + L[i - 1];
		}
		
		System.out.println(L[N]);
	}
}