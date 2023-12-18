package atCoderBeginnerContest171;

import java.util.Scanner;

public class Main {

	//例題は正解
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
		int[] list = new int[100001]; //メイン処理用配列
		int sum = 0; //合計

		//各数字が何回でてくるかカウント
		for(int i=0; i<N; i++) {
			list[A[i]]++;
		}

		//合計初期値
		for(int i=0; i<N; i++) {
			sum += A[i];
		}

		int r = 0;
		for(int i=0; i<Q; i++) {
			r = list[BC[1][i]]; //計算用に退避
			list[BC[1][i]] += list[BC[0][i]]; //Cに変えた分カウントアップ
			sum += BC[1][i] * (list[BC[1][i]] - r); //増えた分sumに追加
			sum -= BC[0][i] * list[BC[0][i]]; //Bの部分は合計から減算
			list[BC[0][i]] = 0; //Bは数列から消える
			System.out.println(sum);
		}
	}

}
