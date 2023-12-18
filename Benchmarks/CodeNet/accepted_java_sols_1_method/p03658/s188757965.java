import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	// 2018/05/29
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] l = new Integer[N];
		for (int i=0; i<N; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l, Collections.reverseOrder());
		int res = 0;
		for (int i=0; i<K; i++) {
			int a = res += l[i];
			if ( a < 50 )  res = a;
		}
		System.out.println(res);
	}
}
