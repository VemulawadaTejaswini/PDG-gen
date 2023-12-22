import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[] B = new int[M];
		for(int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			int num = C;
			for(int j = 0; j < M; j++) {
				num += sc.nextInt() * B[j];
			}
			if(num > 0)cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

