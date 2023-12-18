import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, q;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] S = new int[n];
		for(int i = 0 ; i < n ; i++) S[i] = sc.nextInt();
		q = sc.nextInt();
		int[] T = new int[q];
		for(int i = 0 ; i < q ; i++) T[i] = sc.nextInt();
		Arrays.sort(S);

		long ans = 0;
		for(int i = 0 ; i < q ; i++) {
			if(binary_search(T[i], S)) ans++;
		}
		System.out.println(ans);
	}

	public static boolean binary_search(int x, int[] S) {
		int l = 0;
		int r = n;
		while(r > l) {
			int center = (l + r) / 2;
			if(x == S[center]) return true;
			else if(x > S[center]) l = center + 1;
			else r = center;
		}
		return false;
	}

}