import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //N個の自然数

		int[] A = new int[N]; //N個の数列A
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int Q = sc.nextInt(); //操作を行う回数

		int[][] BC = new int[2][Q]; //BとCを格納する配列
		for(int i=0; i<Q; i++) {
			BC[0][i] = sc.nextInt(); //Bを格納
			BC[1][i] = sc.nextInt(); //Cを格納
		}

		//メイン処理
		int[] list = new int[100001];
		int sum = 0;

		for(int i=0; i<N; i++) {
			list[A[i]]++;
		}

		for(int i=0; i<N; i++) {
			sum += A[i];
		}

		for(int i=0; i<Q; i++) {
			list[BC[1][i]] += list[BC[0][i]];
			sum += BC[1][i] * list[BC[1][i]];
			sum -= BC[0][i] * list[BC[0][i]];
			list[BC[0][i]] = 0;
			System.out.println(sum);
		}
	}

}
