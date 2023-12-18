import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		int t1 = 0;
		int t2 = 0;
		int turn = 1;
		for(int i = N - 1; i >= 0; i--) {
			if(turn == 1) {
				t1 += a[i];
			}else {
				t2 += a[i];
			}
			turn *= -1;
		}
		int ans = t1 - t2;
		System.out.println(ans);
	}
}