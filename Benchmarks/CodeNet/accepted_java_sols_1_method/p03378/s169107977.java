import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int X = scanner.nextInt();

		//長さMのint型配列arrayを宣言
		int[] array = new int[M];

		//arrayに値を追加
		for (int i = 0; i < M; i++) {
			array[i] = scanner.nextInt();
		}

		/*
		for (int i : array) {
			System.out.println("array：" + i);
		}
		*/

		//Integer型の配列cellを宣言(コストを表す)
		int[] cell = new int[N+1];

		//全てのマスのコストは0とする
		Arrays.fill(cell, 0);

		//arrayに入っている値のマスのコストは1
		for (int i : array) {
			cell[i] = 1;
		}

		/*
		for (int i : cell) {
			System.out.println("cell：" + i);
		}
		*/

		//最小コストの計算
		//スタート地点はcell[X]
		//0がゴールの場合
		int cost0 = 0;
		for (int i = X; i >= 0; i--) {
			cost0 += cell[i];
		}

		int costN = 0;
		//Nがゴールの場合
		for (int i = X; i < N+1; i++) {
			costN += cell[i];
		}

		//System.out.println("cost0：" + cost0);
		//System.out.println("costN：" + costN);

		int cost = cost0 <= costN ? cost0 : costN;
		System.out.println(cost);
	}
}