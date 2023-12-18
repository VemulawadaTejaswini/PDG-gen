import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] P = new int[N];
		for(int i = 0; i < N; i++) {
			P[i] = stdIn.nextInt();
		}
		Arrays.sort(P);
		int S = 0;
		IN:for(int i = 0; i < 4; i++) {
			for(int j = P.length-1; j >= 0; j--) {
				if(S + P[j] <= M) {
					S += P[j];
					continue IN;
				}
			}
		}
		System.out.println(S);
	}
}