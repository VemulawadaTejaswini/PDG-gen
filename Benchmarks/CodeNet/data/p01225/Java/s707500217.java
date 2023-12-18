import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num[] = new int[9];
		int color[] = new int[9];
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		// 回数counter入力
		int counter = scanner.nextInt();

		// カードの配列numとcolorの定義と入力、格納
		for (int trial = 0; trial < counter; trial++) {
			int rednum = 0;
			int greennum = 0;
			int bluenum = 0;

			for (int hand = 0; hand < 9; hand++) {
				num[hand] = scanner.nextInt();
			}
			for (int hand = 0; hand < 9; hand++) {
				String input = scanner.next();
				if ("R".equals(input)) {
					color[hand] = 1;
					rednum++;
				} else if ("G".equals(input)) {
					color[hand] = 2;
					greennum++;
				} else if ("B".equals(input)) {
					color[hand] = 3;
					bluenum++;
				}
			}
			// 色R,G,Bの配列の定義
			int[] red = new int[rednum];
			int[] green = new int[greennum];
			int[] blue = new int[bluenum];
			int redindex = 0;
			int greenindex = 0;
			int blueindex = 0;

			// 色配列にnumの要素を格納
			for (int i = 0; i < 9; i++) {
				if (color[i] == 1) {
					red[redindex] = num[i];
					redindex++;
				} else if (color[i] == 2) {
					green[greenindex] = num[i];
					greenindex++;
				} else if (color[i] == 3) {
					blue[blueindex] = num[i];
					blueindex++;
				}
			}
			// 色配列をソート
			Arrays.sort(red);
			Arrays.sort(green);
			Arrays.sort(blue);

			// カードの合計セット数setcountとcountメソッドの宣言、初期化
			int setcount = 0;
			setcount += count(red);
			setcount += count(green);
			setcount += count(blue);

			// setcountが3なら1、それ以外なら0を出力
			if (setcount == 3) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			//System.out.println(setcount);

		}

	}

	public static int count(int a[]) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}

		int setcounter = 0;
		int listsize = a.length;
		// 総当たりで判定
		for (int i1 = 0; i1 < listsize - 2; i1++) {
			for (int i2 = i1 + 1; i2 < listsize - 1; i2++) {
				for (int i3 = i2 + 1; i3 < listsize; i3++) {
					if (i1 != i2 && i1 != i3 && i2 != i3) {
						if (list.get(i1) + 1 == list.get(i2)
								&& list.get(i1) + 2 == list.get(i3)) {
							list.remove(i3);
							list.remove(i2);
							list.remove(i1);
							setcounter++;
							listsize = list.size();
							i2 = i1 + 1;
							i3 = i2;
						} else if (list.get(i1) == list.get(i2) && list.get(i1) == list.get(i3)) {
							list.remove(i3);
							list.remove(i2);
							list.remove(i1);
							setcounter++;
							listsize = list.size();
							i2 = i1 + 1;
							i3 = i2;
						}
					}
				}
			}
		}
		//for (int s : list) {
		//	System.out.println(s);
		//}
		return setcounter;
	}
}

