import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] x = new int[N];
		int[] y = new int[M];

		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
		}

		for(int i=0;i<M;i++) {
			y[i]=sc.nextInt();
		}

		Arrays.sort(x);
		Arrays.sort(y);

		int K = Y-X;

		for(int i=1; i<=K; i++) {
			if(x[N-1]<X+i && X+i<=y[0]) {
				System.out.print("No War"); break;
			}
			if(i==K) System.out.print("War");

		}
	}

}
