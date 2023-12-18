import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//入力
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

		//主処理
		long[] S = new long[Q]; //出力用の数列S

		Arrays.sort(A); //数列Aをソート

		for(int i=0; i<Q; i++){ //Q回繰り返す

			int B = BC[0][i]; //Bを取り出しておく
			int C = BC[1][i]; //Cを取り出しておく

			int indexI = N/2; //添え字：配列の真ん中
			int indexJ = indexI;

			//二分探索
			do {
				if(A[indexI] == B) {
					A = replace(A, N, B, C, indexI);
					break;
				}else if(A[indexI] < B) {
					indexJ = indexI;
					indexI = indexI + (N-indexI)/2;
					continue;
				}else {
					indexJ = indexI;
					indexI = indexI/2;
					continue;
				}
			}while((indexJ-indexI) >= 1 || (indexI-indexJ) >= 1) ;

			//合計計算
			for(int a : A) {
				S[i] += a;
			}
		}

		//出力
		for(int i=0; i<Q; i++) {
			System.out.println(S[i]);
		}
	}

	//配列の要素とBが一致した場合に入れ替える処理
	//隣の要素も同じ数字であることを考慮
	private static int[] replace(int[] A, int N, int B, int C, int indexI) {
		int indexJ = indexI;

		while(A[indexJ] == B) {
			A[indexJ] = C;
			if(indexJ > 0) {
				indexJ -= 1;
				continue;
			}
			break;
		}

		while(A[indexI] == B) {
			A[indexI] = C;
			if(indexI < (N-1)) {
				indexI += 1;
				continue;
			}
			break;
		}

		return A;
	}

}
