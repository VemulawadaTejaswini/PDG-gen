import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int max = 0, second = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] >= max) {
				second = max;
				max = A[i];
			}
			else if(A[i] > second)
				second = A[i];
		}
		for(int i = 0; i < N; i++)
			System.out.println(A[i] == max ? second : max);

	}

}