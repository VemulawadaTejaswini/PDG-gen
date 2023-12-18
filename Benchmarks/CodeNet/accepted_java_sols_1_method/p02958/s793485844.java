import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		Arrays.setAll(P, i -> sc.nextInt());
		sc.close();

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (P[i] != (i + 1)) {
				cnt++;
			}
		}

		if (cnt == 0 || cnt == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
