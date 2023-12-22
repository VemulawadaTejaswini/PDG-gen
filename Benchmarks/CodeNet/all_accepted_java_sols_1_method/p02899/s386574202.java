import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] result = new int[N];
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			result[a - 1] = i;

		}
		
		for(int i = 0; i < N; i++) {
			if (i != N - 1) {
				System.out.print(result[i] + " ");
			} else {
				System.out.print(result[i]);
			}
		}
	}
}