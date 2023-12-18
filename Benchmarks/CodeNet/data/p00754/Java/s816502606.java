import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 配列の初期化
	public static void create(int a[], int n) {
		int i;
		for (i = 0; i < n; ++i) {
			a[i] = -1;
		}
	}

	// 配列のサイズ
	public static int count(int a[], int n) {
		int i;
		for (i = 0; i < n; ++i) {
			if (a[i] == -1) {
				break;
			}
		}
		--i;
		return i;
	}

	// a1,a2 = (), b1, b2 = [], (),[]のバランスが成立したとき、1不成立の時、-1を返す
	public static int compare(int a1[], int a2[], int b1[], int b2[], int n) {
		int i, j;// ループカウンタ
		int count1 = -2;

		// ()または[]の不成立条件
		if (count(a1, n) != count(a2, n) || count(b1, n) != count(b2, n)) {
			return -1;
		}

		if (count(a1, n) >= 0 && count(b1, n) >= 0) {
			for (i = 0; i <= count(a1, n); ++i) {
				for (j = 0; j <= count(b1, n); ++j) {
					// "()"の中に"["が単独で入っているとき
					if (b1[j] > a1[j] && b1[j] < a2[i] && b2[i] > a2[i]) {
						// "("と"("の間に"["があるとき
						if (a1[count(a1, n)] > b1[j]) {
							continue;
						}
						return -1;
					}
				}
			}
			for (i = 0; i <= count(b1, n); ++i) {
				for (j = 0; j <= count(a1, n); ++j) {
					// "[]"の中に"("が単独で入っているとき
					if (a1[j] > b1[j] && a1[j] < b2[i] && a2[i] > b2[i]) {
						// "["と"["の間に"("があるとき
						if (b1[count(b1, n)] > a1[j]) {
							continue;
						}
						return -1;
					}
				}
			}
		}

		for (i = 0; i <= count(a1, n); ++i) {
			count1 = -1;
			for (j = 0; j <= count(a1, n); ++j) {
				if (a2[i] - a1[j] > 0) {// "()"の組み合わせが成り立っている
					++count1;
				}
			}
		}
		if (count1 == -1) {// "()"の組合わせが成り立たないとき
			return -1;
		}

		for (i = 0; i <= count(b1, n); ++i) {
			count1 = -1;
			for (j = 0; j <= count(b1, n); ++j) {
				if (b2[i] - b1[j] > 0) {// {//"[]"の組み合わせが成り立っている
					++count1;
				}
			}
		}
		if (count1 == -1) {// "[]"の組合わせが成り立たないとき
			return -1;
		}

		return 1;// 成立
	}

	public static void main(String[] args) {
		char ch;// 文字を格納
		int c/* 読み込み先 */;
		int p1[]/* "("の位置 */, p3[]/* "["の位置 */;
		int p2[]/* ")"の位置 */, p4[]/* "]"の位置 */;
		int i = 0, k = 0, j = 0, m = 0, l = 0;// ループカウンタ
		InputStreamReader isr = new InputStreamReader(System.in);// 読み込み
		// 配列の宣言
		p1 = new int[1000];
		p2 = new int[1000];
		p3 = new int[1000];
		p4 = new int[1000];
		// 初期化
		create(p1, 1000);
		create(p2, 1000);
		create(p3, 1000);
		create(p4, 1000);
		try {
			while (true) {
				c = isr.read();
				ch = (char) c;
				// データセット入力終了条件
				if (ch == '.') {
					break;
				} else if (ch == '\r') {// 改行コード
					continue;
				} else if (ch == '\n') {// 改行コード
					continue;
				} else {
					while (true) {
						// 入力終了条件
						if (ch == '.') {
							// 表示
							// yesの時
							if (compare(p1, p2, p3, p4, 1000) > 0) {
								System.out.println("yes");
								// 初期化
								create(p1, 1000);
								create(p2, 1000);
								create(p3, 1000);
								create(p4, 1000);
								i = 0;
								k = 0;
								m = 0;
								l = 0;
								j = 0;
								break;
							} else {// noの時
								System.out.println("no");
								// 初期化
								create(p1, 1000);
								create(p2, 1000);
								create(p3, 1000);
								create(p4, 1000);
								i = 0;
								k = 0;
								m = 0;
								l = 0;
								j = 0;
								break;
							}
						}
						// p1,p2,p3,p4にそれぞれ"(",")","[","]"の位置を格納
						else if (ch == '(') {
							p1[k] = i;
							++k;
						} else if (ch == ')') {
							p2[m] = i;
							++m;
						} else if (ch == '[') {
							p3[l] = i;
							++l;
						} else if (ch == ']') {
							p4[j] = i;
							++j;
						}
						c = isr.read();// 文字読み込み
						ch = (char) c;// 変換
						++i;
					}
				}
			}
			isr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

