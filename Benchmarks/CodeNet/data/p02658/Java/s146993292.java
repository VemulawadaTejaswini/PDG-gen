import java.util.Scanner;

public class Main {
	private static final long MAX = 1000000000000000000L;
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean over = false;
		long answer = 1L;
		for(int i = 0; i < N; i++) {
			long A = sc.nextLong();
			if((answer * A) < 0 || (answer * A) > MAX) {
				over = true;
			} else {
				over = false;
			}
			if(!over) answer *= A;
		}
		sc.close();
		prtln(over ? -1 : answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}