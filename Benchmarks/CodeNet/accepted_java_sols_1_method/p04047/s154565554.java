import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] L = new Integer [2 * N];
		for(int i =0; i < 2 * N; i++) {
			L[i] = sc.nextInt();
		}
		Arrays.sort(L, Collections.reverseOrder());
		int ans = 0;
		for(int i = 0; i < 2 * N; i++) {
			if(i % 2 != 0) ans += L[i];
		}
		sc.close();
		System.out.println(ans);
	}

}
