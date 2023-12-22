import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		while (H > 0) {
			int HHWW = H * H + W * W;

			// >この問題の入力で与えられる横長整長方形に対しては，
			// >それより大きい最小の横長整長方形の高さと幅はともに150を超えないことが分かっている．
			int bestH = 149;
			int bestW = 150;
			int bestHHWW = bestH * bestH + bestW * bestW;

			for (int h = 1;h <= 149;++h) {
				for (int w = h + 1;w <= 150;++w) {
					int hhww = h * h + w * w;
					if (HHWW < hhww || (HHWW == hhww && H < h)) {
						if (hhww < bestHHWW || (bestHHWW == hhww && h < bestH)) {
							bestH = h;
							bestW = w;
							bestHHWW = hhww;
						}
					}
				}
			}
			
			System.out.println(bestH +" " + bestW);

			H = sc.nextInt();
			W = sc.nextInt();
		}

	}
}

