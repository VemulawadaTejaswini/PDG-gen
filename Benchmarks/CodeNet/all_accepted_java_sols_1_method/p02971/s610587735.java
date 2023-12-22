import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int top1 = 0;
		int top2 = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i] > top1) {
				top2 = top1;
				top1 = A[i];
			} else if (A[i] > top2) {
				top2 = A[i];
			}
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			if (A[i] == top1) {
				System.out.println(top2);
			} else {
				System.out.println(top1);
			}
		}
	}
}
