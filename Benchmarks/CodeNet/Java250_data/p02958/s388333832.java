import java.util.*;

public class Main{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for(int i = 0; i < N; i++) {
			int input = sc.nextInt();
			X[i] = input;
			Y[i] = input;
		}
		Arrays.sort(X);
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(X[i] != Y[i])count++;
		}
		System.out.println((count <= 2)?"YES":"NO");
		}
}