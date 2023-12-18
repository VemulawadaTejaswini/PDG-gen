import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[]h = new int [N];
		for(int i=0;i<N;i++) {
			h[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(h);

		int x = 1000000001;

		for(int i=0;i<N-K+1;i++) {
			if(x > h[i+K-1]-h[i]) {
				x = h[i+K-1]-h[i];
			}

		}
		System.out.println(x);
	}

}
