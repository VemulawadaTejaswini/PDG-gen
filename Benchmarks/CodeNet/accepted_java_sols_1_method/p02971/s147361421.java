import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] left = new int[N];
		int[] right = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		// System.out.println("--------");
		// 左からのMAXを保持
		left[0] = A[0];
		// System.out.print(left[0] + " ");
		for(int i = 1; i < N; i++) {
			left[i] = Math.max(left[i - 1], A[i]);
			// System.out.print(left[i] + " ");
		}
		// System.out.println("");
		// 右からのMAXを保持
		right[N - 1] = A[N - 1];
		// System.out.print(right[N - 1] + " ");
		for(int i = N - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], A[i]);
			// System.out.print(right[i] + " ");
		}
		// System.out.println("\n--------");
		// 結果出力
		System.out.println(right[1]);
		for(int i = 1; i < N - 1; i++) {
			System.out.println(Math.max(left[i - 1], right[i + 1]));
		}
		System.out.println(left[N - 2]);
	}
}	
