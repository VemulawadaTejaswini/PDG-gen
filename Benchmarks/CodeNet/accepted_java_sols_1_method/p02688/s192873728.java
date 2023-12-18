import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = 0;
		}
		for (int i = 0; i < K; i++) {
			int loop = Integer.parseInt(sc.next());
			for (int j = 0; j < loop; j++) {
				A[Integer.parseInt(sc.next()) - 1] = 1;
			}
		}

		//ここまでinput
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
