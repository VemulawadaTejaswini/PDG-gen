import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] C = sc.next().toCharArray();
		sc.close();

		int rCnt = 0;
		for (int i = 0; i < N; i++) {
			if (C[i] == 'R') {
				rCnt++;
			}
		}

		int cnt = 0;
		for (int i = 0; i < rCnt; i++) {
			if (C[i] == 'W') {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
