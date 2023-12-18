import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[sc.nextInt()-1] = i + 1;
		}
		StringBuilder out = new StringBuilder();
		for(int i = 0; i < N; i++) {
			out.append(A[i] + " ");
		}
		System.out.println(out);
		sc.close();
	}

}
