import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int answer = 0;
		boolean[] r = new boolean[N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				if(A[i] % A[j] == 0) {
					r[i] = true;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			if(!r[i]) answer++;
		}
		prtln(answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
