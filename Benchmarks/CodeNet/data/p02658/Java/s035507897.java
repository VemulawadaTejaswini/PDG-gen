import java.util.Scanner;

public class Main {
	private static final long MAX = 1000000000000000000L;
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();
		long answer = 1L;
		boolean over = false;
		for(int i = 0; i < N; i++) {
			if(A[i] == 0L) {
				answer = 0L;
				break;
			}
			if(!over) {
				if(answer * A[i] > MAX) {
					over = true;
				} else {
					answer *= A[i];
				}
			}
		}
		prtln(over ? -1 : answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}