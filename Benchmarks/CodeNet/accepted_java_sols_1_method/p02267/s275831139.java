import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		Arrays.sort(S);
		
		int q = sc.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = sc.nextInt();
		}
		Arrays.sort(T);
		
		int s = 0;
		int t = 0;
		int count = 0;
		while(s < S.length && t < T.length) {
			if (S[s] == T[t]) {
				count++;
				s++;
				t++;
			} else if(S[s] > T[t]) {
				t++;
			} else {
				s++;
			}
		}
		System.out.println(count);
	}
}