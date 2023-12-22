import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D[] = new int[N];
		for(int i = 0; i < N; i++) {
			D[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int T[] = new int[M];
		for(int i = 0; i < M; i++) {
			T[i] = sc.nextInt();
		}
		Arrays.sort(D);
		Arrays.sort(T);
		int cnt = 0;
		out : for(int i = 0; i < M; i++) {
			for(int j = cnt; j < N; j++) {
				if(T[i] == D[j]) {
					if(i == M - 1) {
						System.out.println("YES");
						return;
					} else {
						cnt = j + 1;
						continue out;
					}
				}
			}
			System.out.println("NO");
			return;
		}
	}
}
