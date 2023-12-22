import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] B = new int[N+1];
		int X = 0;
		for(int i = 0; i < N; i++)
			B[sc.nextInt()] += 1;
		Arrays.sort(B);
		for(int i = N; i >= N - K + 1; i--)
			X += B[i];
		System.out.println(N-X);

	}

}