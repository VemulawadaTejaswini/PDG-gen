import java.util.Scanner;

public class Main {

	/**
	 * @param n:要素数
	 * @param x_i:要素xの配列
	 * @param y_i:要素yの配列
	 * @param diff_i:xとyの差分の配列
	 */
	public static Scanner inputData = null;
	public static int n = 0;
	public static int[] x_i = new int[1000];
	public static int[] y_i = new int[1000];
	public static int[] diff_i = new int[1000];
	
	public static void main(String[] args) {
		// TODO データ間の距離を測る
//		入力データを取得する処理
		getData();
//		x,yの差分を出す処理
		getDiff();
//		マンハッタン距離(p=1)を求めて出力する処理
		getDist_p1();
//		ユークリッド距離(p=2)を求めて出力する処理
		getDist_p2();
//		p=3の時の距離を求めて出力する処理
		getDist_p3();
//		チェビシェフ距離(p=∞)を求めて出力する処理
		getDist_pinf();
	}

	private static void getDist_pinf() {
		// TODO 自動生成されたメソッド・スタブ
		double dDist_pinf = 0;
		for( int count=0; count<n; count++) {
			dDist_pinf = Math.max( dDist_pinf, diff_i[count]);
		}
		outputResult( dDist_pinf);
	}

	private static void getDist_p3() {
		// TODO 自動生成されたメソッド・スタブ
		double dDist_p3 = 0;
		for( int count=0; count<n; count++) {
			dDist_p3 += Math.pow(diff_i[count], 3);
		}
		dDist_p3 = Math.pow(dDist_p3, ( double)1/3);
		outputResult( dDist_p3);
	}

	private static void getDist_p2() {
		// TODO 自動生成されたメソッド・スタブ
		double dDist_p2 = 0;
		for( int count=0; count<n; count++) {
			dDist_p2 += Math.pow(diff_i[count], 2);
		}
		dDist_p2 = Math.pow(dDist_p2, ( double)1/2);
		outputResult( dDist_p2);
	}

	private static void getDist_p1() {
		// TODO 自動生成されたメソッド・スタブ
		double dDist_p1 = 0;
		for( int count=0; count<n; count++) {
			dDist_p1 += diff_i[count];
		}
		outputResult( dDist_p1);
	}


	private static void outputResult(double dist) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println( dist);
	}

	private static void getDiff() {
		// TODO 自動生成されたメソッド・スタブ
		for( int count=0; count<n; count++) {
			diff_i[count] = Math.abs( x_i[count] - y_i[count]);
		}
	}

	private static void getData() {
		// TODO 自動生成されたメソッド・スタブ
//		配列の初期化
		for( int count=0; count<x_i.length; count++) {
			x_i[count] = 0;
			y_i[count] = 0;
		}
		inputData = new Scanner( System.in);
		n = inputData.nextInt();
		for( int count=0; count<n; count++) {
			x_i[count] = inputData.nextInt();
		}
		for( int count=0; count<n; count++) {
			y_i[count] = inputData.nextInt();
		}
	}

}

