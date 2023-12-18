
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2750 Hyakunin Isshu 百人一首
 *
 *    2018/02/08
 */
public class Main {

    class Card implements Comparable<Card> {
        String s;
        int f;  // 過半数先頭一致のとき1(f1,f2と呼ぶ)
        int ch; // f1ruiの次の文字

        Card(String s) {
            this.s = s;
        }

        @Override
        public int compareTo(Card o) {
            return s.compareTo(o.s);
        }
        @Override
        public String toString() {
            return s;
        }
    }

    // 区別する必要のないカードをまとめる
    class Card2 {
        int f;  // 1:f1 2:f1より前 3 f1より後
        int ch; // f1の場合のf1ruiの次の文字
        List<Card> list = new ArrayList<Card>();
        int n;    // 枚数
        int use; // 使用枚数

        Card2() {
        }

        @Override
        public String toString() {
            return String.format("f%d ch = %c n = %d", f, ch == 0 ? '@' : ch, n);
        }

    }

    //類似度
    int ruijido(String s0, String s1) {
        int i;
        for(i = 0;; i++) {
            if (i >= s0.length())
                break;
            if (i >= s1.length())
                break;
            if (s0.charAt(i) != s1.charAt(i))
                break;
        }
        return i;
    }

    //類似度の総和
    int sowa(String[] s) {
        int w = 0;
        for(int i = 0; i < s.length - 1; i++) {
            w += ruijido(s[i], s[i + 1]);
        }
        return w;
    }

    //類似度の総和 引数をStackにした
    int sowa2(List<Stack> stackList, Card[] list) {
        int w = 0;
        for(int i = 0; i < stackList.size() - 1; i++) {
            w += ruijido(list[stackList.get(i).i].s, list[stackList.get(i + 1).i].s);
        }
        return w;
    }

    // 接頭辞分析 f1,f2のセット
    int[] head(Card[] list) {
        List<Integer> result = new ArrayList<Integer>();
        int hansu = (list.length + 1) / 2; // 半数

        for(int i = 0; i < list.length; i++) {
            list[i].f = 1; // f1で初期化
        }

        int maxCntOld = list.length;
        int start = 0;
        int size = list.length;
        for(int n = 0;; n++) { // n文字目
            char ch = 0;
            int cnt = 0;
            int start2 = 0;
            int maxCnt = 0;
            int maxStart = 0;
            //log.printf("start size = %d %d\n",  start, size);
            for(int i = start;; i++) {
                if (i < start + size && list[i].s.length() > n && list[i].s.charAt(n) == ch) {
                    cnt++;
                }
                else {
                    //log.printf("%d '%c' %d\n", n, ch, cnt);
                    if (cnt > maxCnt) {
                        maxCnt = cnt;
                        maxStart = start2;
                    }
                    if (i >= start + size) {
                        break;
                    }
                    if (list[i].s.length() > n) {
                        ch = list[i].s.charAt(n);
                    }
                    else
                        ch = 0;
                    start2 = i;
                    cnt = 1;
                }
            }

            if (maxCnt < hansu) {
                log.printf("next %d cnt = %d start = %d\n", n + 1, maxCnt, maxStart);
                break;
            }
            if (n < 100) // 長い文字列抑制
                log.printf("%d cnt = %d %s start = %d\n", n + 1, maxCnt, list[maxStart].s.substring(0, n + 1), maxStart);
            result.add(maxCnt);

            // f更新
            if (maxCnt < maxCntOld) {
                maxCntOld = maxCnt;
                for(int i = 0; i < list.length; i++) {
                    Card card = list[i];
                    if (card.f == 2) {
                        card.f = 0;
                    }
                    else if (card.f == 1) {
                        card.f = 2;
                    }
                    if (maxStart <= i && i < maxStart + maxCnt) {
                        card.f = 1;
                    }
                }
            }

            start = maxStart;
            size = maxCnt;

        }

        int[] a = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }
        log.printf("%s\n", Arrays.toString(a));

        return a;

    }

    class Stack {
        int i;
        int gmode; // iを配置する前の値 TODO gmode使ってない
        boolean senko; // 先行配置
        Card2 card2;
    }


    // 配置する
    Stack[] set(Card[] list, int[] head) {
        int N = list.length;
        int f1rui = head.length;  // f1の類似度
        int f1cnt;// f1の数
        if (f1rui == 0) {
            f1cnt = N;
        }
        else {
            f1cnt = head[f1rui - 1];
        }
        boolean f1harf = (f1cnt * 2 == N);  // f1がぴったり半分の場合
        if (f1harf) {
            log.printf("!!! f1harf !!!\n");
            assert false;
        }
        int[] f = new int[N]; // 使用フラグ 使用済みが1
        Stack[] stackList = new Stack[N]; // 配置マップ
        for(int i = 0; i < N; i++) {
            stackList[i] = new Stack();
        }

        // f0先行配置
        for(int i = 0;; i++) {
            if (list[i].f == 1)
                break;
            stackList[i * 2 + 1].senko = true;
            stackList[i * 2 + 1].i = i;
            f[i] = 1;
            //log.printf("senko %d %s\n",i * 2 + 1, list[i].s);
        }
        for(int i = 0;; i++) {
            if (list[N - 1 -i].f == 1)
                break;
            stackList[N - 2 - i * 2].senko = true;
            stackList[N - 2 - i * 2].i = N - 1 - i;
            f[N - 1 - i] = 1;
            //log.printf("senkob %d %s\n",N - 2 - i * 2, list[N - 1 - i].s);
        }

        int p = 0;
        Stack stack = stackList[p];
        stack.gmode = (N % 2 == 0) ? -1 : 0; // gmode初期値
        int ch = 0; // チェック済みのch
        int state = 3;
        loop:for(;;) {
            switch(state) {
            case 3: // p++された
                ch = -1;
                if (stack.senko) {
                    int nextGmode = stack.gmode;
                    p++;
                    if (p >= N) {
                        //log.printf("%s\n",  Arrays.toString(a));
                        break loop; // 完全終了
                    }
                    stack = stackList[p];
                    stack.i = 0;
                    stack.gmode = nextGmode;
                    state = 3;
                    break;
                }
                state = 0;
                break;
            case 0:
                if (stack.i >= N) {
                    state = 1;
                    break;
                }
                // 配置チェック
                if (f[stack.i] != 0) {
                    state = 2; // 使用済みだめ
                    break;
                }
                // f1規則
//                if (list[stack.i].f != 1) {
//                    if (f1harf && list[stack.i].f == 2 &&
//                            (p == 0 || (p == N - 1 && stack.gmode != 1))) {
//                        ; // f2 OK
//                    }
//                    else
//                    if (p == 0
//                     || p == N - 1
//                     || (stack.gmode == 0 && p % 2 == 0)
//                     || (stack.gmode == 1 && p % 2 == 1)) {
//                         state = 2; // だめ
//                         break;
//                     }
//                }
                // 前との類似度がf1類似度より大きくなってはいけない
//                if (p > 0 && ruijido(list[stackList[p - 1].i].s, list[stack.i].s) > f1rui) {
                if (p > 0 && list[stackList[p - 1].i].f == 1 && list[stack.i].f == 1 &&
//                        list[stackList[p - 1].i].s.length() > f1rui &&
//                        list[stack.i].s.length() > f1rui &&
//                        list[stackList[p - 1].i].s.charAt(f1rui) == list[stack.i].s.charAt(f1rui)) {
                        list[stack.i].ch != 0 && list[stackList[p - 1].i].ch == list[stack.i].ch) {
                    state = 2; // だめ
                    break;
                }


                // 配置
                f[stack.i] = 1;

                // gmode更新
                int nextGmode = stack.gmode;
                if (stack.gmode < 0) {
                    Card card = list[stack.i];
                    if (f1harf && card.f == 2 && p == 0) {
                        nextGmode = 1;
                    }
                    else if (card.f != 1) {
                        if (p != 0 && p != N - 1) {
                            nextGmode = (p % 2 == 0) ? 1 : 0;
                        }
                    }
                }
                p++;
                if (p >= N) {
                    //log.printf("%s\n",  Arrays.toString(a));
                    break loop; // 完全終了
                }
                stack = stackList[p];
                if (!stack.senko) {
                    stack.i = 0;
                }
                stack.gmode = nextGmode;
                state = 3;
                break;
            case 2: // i++
                stack.i++;
                // 一度試したchはしない
//                if (stack.i < N && list[stack.i].f == 1 && ch == list[stack.i].ch) {
                if (stack.i < N && list[stack.i].f == 1 && ch == list[stack.i].ch) {
                    //log.printf("break p=%d %s \n", p, list[stack.i].s);
                    state = 2;
                    break;
                }
                state = 0;
                break;
            case 1: // p--
                p--;
                if (p < 0) {
                    log.printf("全検索したがみつからなかった\n");
                    break loop; // 完全終了
                }
                stack = stackList[p];
                if (stack.senko) {
                    state = 1;
                    break;
                }
                ch = list[stack.i].ch;
                f[stack.i] = 0;
                state = 2;
                break;
            }
        }
        return stackList;
    }

    // 配置する Card2を使用
    Stack[] set2(Card[] list, int[] head) {
        int N = list.length;

        // card2Listを作る
        List<Card2> card2List_ = new ArrayList<Card2>();
        Card2 card2 = null;
        for(int i = 0; i < N; i++) {
            Card card = list[i];
            boolean n = true; // 新しいCard2を作るか
            if (card2 != null) {
                if (card2.f != 1 && card.f != 1)
                    n = false;
                if (card2.f == 1 && card.f == 1 && card2.ch == card.ch)
                    n = false;
            }
            if (n) {
                card2 = new Card2();
                card2.f = card.f;
                card2.ch = card.ch;
                card2List_.add(card2);
            }
            card2.list.add(card);
            card2.n++;
        }
        Card2[] card2List = card2List_.toArray(new Card2[0]);

        int f0cnt = 0;  // 非f1の残り数
        if (card2List[0].f != 1)
            f0cnt += card2List[0].n;
        if (card2List[card2List.length - 1].f != 1)
            f0cnt += card2List[card2List.length - 1].n;
        log.printf("card2List.length = %d\n", card2List.length);
        log.printf("f0cnt = %d\n", f0cnt);

        Stack[] stackList = new Stack[N]; // 配置マップ
        for(int i = 0; i < N; i++) {
            stackList[i] = new Stack();
        }

        // 探索
        int p = 0;
        Stack stack = stackList[p];
        int state = 3;
        loop:for(;;) {
            sw:switch(state) {
            case 3: // p++された
                state = 0;
                break;
            case 0:
                if (stack.i >= card2List.length) {
                    state = 1;
                    break;
                }
                // 配置チェック
                card2 = card2List[stack.i]; // card2を置こうとする
                if (card2.use >= card2List[stack.i].n) {
                    state = 2; // 使用済みだめ
                    break;
                }

                // 先頭と最後はf1でなくてはいけない
                if ((p == 0 || p == N - 1) && card2.f != 1) {
                    state = 2; // だめ
                    break;
                }

                // f1以外は連続しない
                if (p > 0 && stackList[p - 1].card2.f != 1 && card2.f != 1) {
                    state = 2; // だめ
                    break;
                }

                // f1 同一ch連続は禁止
                if (p > 0 && stackList[p - 1].card2.f == 1 && card2.f == 1
                        && card2.ch != 0 && stackList[p - 1].card2.ch == card2.ch) {
                    state = 2; // だめ
                    break;
                }

                // f1を置くと残りの空間にf0がおききれない
                if (card2.f == 1 && (N - p - 1) / 2 < f0cnt) {
                    state = 2; // だめ
                    break;
                }
                
                // 全てのCard2について
//                if (p == 4) 
//                    System.out.printf("");
                for(int i = 0; i < card2List.length; i++) {
                    if (card2List[i].f != 1 || card2List[i].ch == 0)
                        continue;
                    if ((N - p + 1) / 2 < card2List[i].n - card2List[i].use) { // TODO -1した
                        state = 2; // だめ
                        break sw;
                    }
                }

                // 配置
                card2.use++;
                stack.card2 = card2;
                if (card2.f != 1)
                    f0cnt--;

                p++;
                if (p >= N/*-6*/) { // TODO
                    //log.printf("%s\n",  Arrays.toString(stack));
                    break loop; // 完全終了
                }
                stack = stackList[p];
                if (!stack.senko) {
                    stack.i = 0;
                }
                state = 3;
                break;
            case 2: // i++
                stack.i++;
                state = 0;
                break;
            case 1: // p--
                p--;
                if (p < 0) {
                    log.printf("全検索したがみつからなかった\n");
                    break loop; // 完全終了
                }
                stack = stackList[p];
                card2List[stack.i].use--;
                if (card2List[stack.i].f != 1)
                    f0cnt++;
                state = 2;
                break;
            }
        }

        // 解表示
        for(int i = 0; i < N; i++) {
            card2 = stackList[i].card2;
            Card c = card2.list.get(card2.n - 1 - (--card2.use));
            //log.printf("f%d ch='%c' %s\n", c.f, c.ch == 0 ? '@' : c.ch, c.s);
            result.printf("%s\n", c.s);
        }

        return null;
    }

    // f1harf専用
    Stack[] setf1harf(Card[] list, int[] head) {
        int N = list.length;

        int f2sentou = -1;
        for(int i = 0; i < N; i++) {
            if (list[i].f == 2) {
                // f2先頭型
                f2sentou = i;
                break;
            }
            if (list[i].f == 1) {
                // f2末端型
                break;
            }
        }

        Stack[] stackList = new Stack[N]; // 配置マップ
        for(int i = 0; i < N; i++) {
            stackList[i] = new Stack();
        }

        if (f2sentou >= 0) {
            // f2先頭型
            stackList[0].i = f2sentou;
            int p = 2;
            for(int i = 0; i < N; i++) {
                if (i != f2sentou && list[i].f != 1) {
                    stackList[p].i = i;
                    p += 2;
                }
            }
            p = 1;
            for(int i = 0; i < N; i++) {
                if (list[i].f == 1) {
                    stackList[p].i = i;
                    p += 2;
                }
            }
        }
        else {
            // f2末端型
            int f2mattan = 0;
            for(int i = N - 1; i >= 0; i--) {
                if (list[i].f == 2) {
                    f2mattan = i;
                    stackList[N - 1].i = i;
                }
            }
            int p = 1;
            for(int i = 0; i < N; i++) {
                if (i != f2mattan && list[i].f != 1) {
                    stackList[p].i = i;
                    p += 2;
                }
            }
            p = 0;
            for(int i = 0; i < N; i++) {
                if (list[i].f == 1) {
                    stackList[p].i = i;
                    p += 2;
                }
            }
        }
        return stackList;
    }


	// メイン return falseでおしまい
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int N = ir[0];
        if (N == 0)
            return false;
        long time1 = System.currentTimeMillis();
        log.printf("time = %.03fsec\n", (time1 - time0) / 1000.);
        log.printf("\n------\nN = %d\n", N);
//result.printf("N = %d\n", N); // TODO

        Card[] list = new Card[N];

        for(int i = 0; i < N; i++) {
            list[i] = new Card(reader.readLine());
        }
//if (N > 100 || N==49) return true; // 40以下はとける
        Arrays.sort(list);
        if (N <= 2) {
            // N=2特殊
            for(int i = 0; i < N; i++) {
                result.printf("%s\n", list[i].s);
            }
            return true;
        }
        if (N < 10) {
            for(int i = 0; i < N; i++) {
                log.printf("[%s]\n", list[i].s);
            }
        }

        int hansu = (list.length + 1) / 2; // 半数

        // 接頭辞分析
        int[] head = head(list);
        int f1rui = head.length;  // f1の類似度

        int sa = hansu;
        int mw = 0;  // 類似度の総和の最小値

        int hanbunf = 0;
        if (head.length > 0) {
            int n = head.length - 1;
            mw += (head[n] - hansu) * 2 * (n + 1);
            if (list.length % 2 == 0)
                if (mw > 0) {
                    mw -= (n + 1); // 偶数なら最後の１個が半分
                }
                else {
                    hanbunf = 1; // ぴったり半分だった
                }
            sa = head[n];
            n--;
            for(; n >= 0; n--) {
                mw += (head[n] - sa) * 2 * (n + 1);
                if (hanbunf != 0) {
                    hanbunf = 0;
                    mw -= (head[n] - sa);
                }
                sa = head[n];
            }
        }

        log.printf("f1rui = %d\n", f1rui);
        // chを決定
        for(int i = 0; i < N; i++) {
            Card card = list[i];
            if (i > 0) {
                Card mae = list[i - 1];
                if (mae.f == 1 && mae.s.length() > f1rui &&
                    card.f == 1 && card.s.length() > f1rui &&
                    mae.s.charAt(f1rui) == card.s.charAt(f1rui))
                mae.ch = card.ch = card.s.charAt(f1rui);
            }
        }
        for(int i = 0; i < N; i++) {
            Card card = list[i];
            log.printf("f%d ch = %c %s\n", card.f, card.ch == 0 ? '@' : card.ch, card.s);
        }
        log.printf("mw = %d\n", mw);  // 類似度の総和の最小値 決定

        int f1cnt;// f1の数
        if (f1rui == 0) {
            f1cnt = N;
        }
        else {
            f1cnt = head[f1rui - 1];
        }
        boolean f1harf = (f1cnt * 2 == N);  // f1がぴったり半分の場合

        // 配置
        Stack[] stackList;
        if (f1harf) {
            log.printf("!!! f1harf !!!\n");
            stackList = setf1harf(list, head);
            // 解表示
            for(int i = 0; i < stackList.length; i++) {
                result.printf("%s\n", list[stackList[i].i].s);
            }
        }
        else {
            stackList = set2(list, head);
        }


		return true; // 正常終了 次へ
	}



	static long time0;
//	private final static boolean DEBUG = true;  // debug 　argsに何か書くとdebugになる
	private final static boolean DEBUG = false; // release

	static FileOutputStream out;
    static PrintStream log;
    static PrintStream result;
    static BufferedReader reader;

	public static void main(String[] args) throws IOException {

	    PrintStream DEVNULL = new PrintStream(new OutputStream() { public void write(int b) {} } ); // 書き捨て
        result = System.out;
        log = System.out;

		if (DEBUG || args.length > 0) {
		    out = new FileOutputStream("result.out");
            log = System.out;
	        result = new PrintStream(new OutputStream() { public void write(int b) { System.out.write(b); try {
                out.write(b);
            } catch (IOException e) {
                e.printStackTrace();
            }} } ); // ファイルとコンソール

//			String inputStr = "5:aaa0:aaa1:aaa2:b1:b2:";
//           String inputStr = "5:aaaa0:aaaa1:aaab2:aaac3:c:";
//            String inputStr = "6:aaa0:aaa1:aaa2:aaa3:d:d:";
//            String inputStr = "6:bbb0:bbb:bbb2:bbb3:a:a:";
//          String inputStr = "4:appl:appl:appo:acm:"; // f1harf
          String inputStr = "7:ppp0:ppp1:ppp2:ppp3:a:z";
			inputStr += "0:";

			inputStr = inputStr.replace(":", "\n");

//			reader = new BufferedReader(new StringReader(inputStr));
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("in1.txt"))); // 1 4 12 17 49 50 98

         log = DEVNULL; // 書き捨て
		}
		else {
	         log = DEVNULL; // 書き捨て
//            log = System.out;
			reader = new BufferedReader(new InputStreamReader(System.in)); // コンソールから
//            reader = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		}

		time0 = System.currentTimeMillis();
		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}

        long time1 = System.currentTimeMillis();
        log.printf("end time = %.03fsec\n", (time1 - time0) / 1000.);
		reader.close();
		if (log != null) log.close();
	}




	// 標準入力より1行分の区切り文字区切りでの整数値を読む
	// EOFの場合はnullを返す
	private static int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = reader.readLine();
//			log.printf("%s\n", s);
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // ※※※　どうも突然空行を読むことがある。読み飛ばすとうまくいくらしい。。。。
				break;
		}

		String[] sp = s.split("[ ,]"); // 区切り文字はスペースかカンマ
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}

}




