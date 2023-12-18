import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = i;
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, Comparator.comparingInt(o -> o[1]));
		
		for(int i = 0; i < N; i++) {
			System.out.print(A[i][0] + 1);
			if(i == N - 1) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
	}
}
