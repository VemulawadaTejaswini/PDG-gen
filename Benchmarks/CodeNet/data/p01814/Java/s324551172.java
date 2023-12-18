
import java.io.*;

/**
 * AIZU ONLINE JUDGE
 * 2711 Nearly Cyclic String
 *    2018/02/16
 */
public class Main {

	boolean main() throws IOException {

	    String S = systemin.readLine();
		int[] ir = readIntArray();
		int Q = ir[0];

		for(int q = 0; q < Q; q++) {

        ir = readIntArray();
        int l = ir[0];
        int r = ir[1];
        int t = ir[2];
        log.printf("%s %d %d %d\n", S, l, r, t);

        int dcnt = 0;
        loop:for(int i = 0; i < t; i++) {
            int[] c = new int[2];
            int[] cnt = new int[2];
            int ac = 0;
            for(int j = 0;; j++) {
                int k = j * t + i + l;
                if (k > r)
                    break;
                int ch = S.charAt(k - 1);
                log.printf("i=%d j = %d index = %d '%c'\n", i, j, k, ch);
                for(int p = 0;; p++) {
                    if (p >= 2) {
                        dcnt = 99;
                        break loop;
                    }
                    if (p >= ac) {
                        c[p] = ch;
                        cnt[p] = 1;
                        ac++;
                        break;
                    }
                    if (c[p] == ch) {
                        cnt[p]++;
                        break;
                    }
                }
            }
            if (ac == 2) {
                if (cnt[0] == 1 || cnt[1] == 1) {
                    dcnt++;
                }
                else {
                    dcnt = 99;
                    break loop;
                }
            }
        }
        log.printf("dcnt = %d\n", dcnt);
        if (dcnt <= 1)
            result.printf("Yes\n");
        else
            result.printf("No\n");
		}
        //return true; // 正常終了 次へ
		return false;
	}

	static long time0;

    PrintStream log;
    PrintStream result;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        result = System.out;
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

	public static void main(String[] args) throws IOException {

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = instance.main();
			if (!b)
				break;
		}

        instance.systemin.close();
	}

	// 標準入力より1行分の区切り文字区切りでの整数値を読む
	// EOFの場合はnullを返す
	private int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = systemin.readLine();
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // 突然空行を読むことがある。読み飛ばすとうまくいくらしい
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


