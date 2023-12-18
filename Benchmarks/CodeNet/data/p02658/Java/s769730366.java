import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long answer = 1L;
		long end = (long)Math.pow(10, 18);
		boolean flg = false;
		for(int i = 0; i < N; i++) {
			long A = sc.nextLong();
			if(A == 0) {
				answer = 0L;
				flg = false;
			} else {
				answer *= A;
				if(answer > end) {
					flg = true;
				}
			}
		}
		sc.close();
		prtln(flg ? -1 : answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}