import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();

		int sum[] = new int[N];
		int count = 0;

		int a[][] = new int[N][M];
		int b[] = new int[M];

		for(int i = 0; i < M; i++) {
			b[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++) {
			sum[i] = 0;
			for(int j = 0; j < M; j++) {
				//System.out.println(i + "," + j);
				a[i][j] = sc.nextInt();
				sum[i] += a[i][j] * b[j];
			}
			sum[i] += C;
			if(sum[i] > 0) {
				count++;
			}
		}

		System.out.println(count);

		sc.close();
	}

}