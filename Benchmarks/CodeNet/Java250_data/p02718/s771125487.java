import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		final int M = in.nextInt();
		int[] votes = new int[N];
		int total = 0;
		for(int i = 0; i < N; i++) {
			votes[i] = in.nextInt();
			total += votes[i];
		}
		Arrays.sort(votes);
		if(votes[(N - 1) - (M - 1)] < (double) total * ((double) 1 / ((double) 4 * M)))
			System.out.println("No");
		else System.out.println("Yes");
	}
}