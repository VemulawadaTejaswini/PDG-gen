import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. 入力データの処理
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int v[] = new int[N];
		int c[] = new int[N];
		for(int i = 0; i < N; i++) {
			v[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(v[i] > c[i]) {
				sum += v[i] - c[i];
			}
		}

		System.out.println(sum);
	}

}
