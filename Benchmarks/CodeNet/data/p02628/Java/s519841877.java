import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(p);
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += p[i];
			if(i == K - 1) break;
		}
		prtln(sum);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
