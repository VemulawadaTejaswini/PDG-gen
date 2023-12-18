/*
 xy 平面上に、左下の座標が (0,0)、右上の座標が (W,H) で、各辺が x 軸か y 軸に平行な長方形があります。最初、長方形の内部は白く塗られています。


すぬけ君はこの長方形の中に N 個の点を打ちました。i 個目 (1≦i≦N) 点の座標は (xi,yi) でした。

また、すぬけ君は長さ N の数列 a を決めて、各 1≦i≦N に対し、

ai=1 のときは長方形の x<xi をみたす領域
ai=2 のときは長方形の x>xi をみたす領域
ai=3 のときは長方形の y<yi をみたす領域
ai=4 のときは長方形の y>yi をみたす領域
を黒く塗りました。

塗りつぶしが終わったあとの長方形内での白い部分の面積を求めてください
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();

		int x, y, a;
		int xmax = 0;
		int xmin = h;
		int ymax = 0;
		int ymin = w;

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			a = sc.nextInt();

			if (a == 1) {
				if (x > xmax) {
					xmax = x;
				}
			} else if (a == 2) {
				if (x < xmin) {
					xmin = x;
				}
			} else if (a == 3) {
				if (y > ymax) {
					ymax = y;
				}
			} else if (a == 4) {
				if (y < ymin) {
					ymin = y;
				}
			}
		}

		int area;
		if (xmin - xmax <= 0 || ymin - ymax <= 0) {
			System.out.println(0);
		} else {
			System.out.println((xmin - xmax) * (ymin - ymax));
		}
	}
}