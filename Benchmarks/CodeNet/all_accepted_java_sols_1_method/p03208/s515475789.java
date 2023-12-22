import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		int[] H = new int[N];
		for(int n=0; n<N; n++) {
			H[n] = keyboard.nextInt();
		}
		Arrays.parallelSort(H);
		
		int ans = 1000000001;
		for(int k=0; k+K-1<N;k++) {
			if(H[k+K-1]-H[k]<ans) {
				ans = H[k+K-1]-H[k];
			}
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
