import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		/**
		 *  アルゴリズムの方針
		 *  1) 全て奇数or偶数のケース、1つだけ異なるケースの判定を行う
		 *  2) 全て奇数or偶数の場合、a,b,cの中で最大の数と他の2つの数との差を求め、その半分が操作回数となる
		 *  3a) 1つだけ異なる場合、まず一致する2数の差を求め、その半分を操作回数の一部とする
		 *  3b) 次にその2数のうち大きい方の数に+1し、残りの数との差の絶対値を求める
		 *  3c) (3b)の結果の半分+1を(3a)の結果と足すと操作回数となる
		 */
		int even[];
		even = new int[3];
		even[0] = a % 2;
		even[1] = b % 2;
		even[2] = c % 2;

		int count = 0;
		if(even[0] + even[1] + even[2] == 0 || even[0] + even[1] + even[2] == 3) {
			int max = a;
			int imax = 0;
			if(max < b) {
				max = b;
				imax = 1;
			}
			if(max < c) {
				max = c;
				imax = 2;
			}

			int sum = 0;
			if(imax == 0) {
				sum += max - b;
				sum += max - c;
			}else if(imax == 1) {
				sum += max - a;
				sum += max - c;
			}else {
				sum += max - a;
				sum += max - b;
			}
			count = sum / 2;
		}else if(even[0] + even[1] + even[2] == 1) {
			if(even[0] == 1) {
				if(b > c) {
					count += (b - c) / 2;
					count += Math.abs(a - (b + 1)) / 2 + 1;
				}else {
					count += (c - b) / 2;
					count += Math.abs(a - (c + 1)) / 2 + 1;
				}
			}else if(even[1] == 1) {
				if(a > c) {
					count += (a - c) / 2;
					count += Math.abs(b - (a + 1)) / 2 + 1;
				}else {
					count += (c - a) / 2;
					count += Math.abs(b - (c + 1)) / 2 + 1;
				}
			}else {
				if(a > b) {
					count += (a - b) / 2;
					count += Math.abs(c - (a + 1)) / 2 + 1;
				}else {
					count += (b - a) / 2;
					count += Math.abs(c - (b + 1)) / 2 + 1;
				}
			}
		}else {
			if(even[0] == 0) {
				if(b > c) {
					count += (b - c) / 2;
					count += Math.abs(a - (b + 1)) / 2 + 1;
				}else {
					count += (c - b) / 2;
					count += Math.abs(a - (c + 1)) / 2 + 1;
				}
			}else if(even[1] == 0) {
				if(a > c) {
					count += (a - c) / 2;
					count += Math.abs(b - (a + 1)) + 1;
				}else {
					count += (c - a) / 2;
					count += Math.abs(b - (c + 1)) / 2 + 1;
				}
			}else {
				if(a > b) {
					count += (a - b) / 2;
					count += Math.abs(c - (a + 1)) / 2 + 1;
				}else {
					count += (b - a) / 2;
					count += Math.abs(c - (b + 1)) / 2 + 1;
				}
			}
		}

		System.out.println(count);
	}

}
