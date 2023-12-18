
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2821 Trees in a Forest
 *
 *    2018/02/05
 */

public class Main {

    class Tree {
        List<P> list;
        Tree() {
            list = new ArrayList<P>();
        }
        @Override
        public String toString() {
            String s = "";
            for(P p : list) {
                s += String.format("%d(%d) ", p.no+1, p.list.size());
            }
            return s;
        }
    }

    // 頂点
    class P {
        Tree tree;
        List<P> list; // 連結する頂点
        int no; // no 0はじまり
        P(int no) {
            list = new ArrayList<P>();
            this.no = no;
        }
    }

    // p0の隣点r0以外のツリーと、p1の隣点r1以外のツリーが同型か判断する
    boolean doukei(P r0, P p0, P r1, P p1) {
        List<P> list = new ArrayList<P>(p1.list);
        list.remove(r1);
        for(P p : p0.list) {
            if (p == r0)
                continue;
            int f = 0;
            for(P q : list) {
                if (doukei(p0, p, p1, q)) {
                    f = 1;
                    list.remove(q);
                    break;
                }
            }
            if (f == 0)
                return false; // だめ
        }
        return true;
    }

    // 2つのtreeのp0とp1をルートとして同型か判断する
    boolean doukei(P p0, P p1) {
        return doukei(null, p0, null, p1);
    }

    // 2つのtreeが同型か判断する
    boolean doukei(Tree t0, Tree t1) {

        // 頂点数が違うのはだめ
        if (t0.list.size() != t1.list.size())
            return false;

        // t0の最初の点について、t1のどれかの点が同型になればOK
        for(P p1 : t1.list) {
            if (doukei(t0.list.get(0), p1))
                return true;
        }

        return true;
    }


	// メイン return falseでおしまい
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int N1 = ir[0]; // 森の頂点数
		int M1 = ir[1]; // 森の変数
//        if (n == 0)
//            return false;

		P[] pa = new P[N1];
		List<Tree> mori = new ArrayList<Tree>();

		for(int i= 0; i < M1; i++) {
            ir = readIntArray();
            P p0 = pa[ir[0]-1];
            P p1 = pa[ir[1]-1];
            if (p0 == null && p1 == null) {
                p0 = pa[ir[0]-1] = new P(ir[0]-1);
                p1 = pa[ir[1]-1] = new P(ir[1]-1);
                p0.tree = p1.tree = new Tree();
                mori.add(p0.tree);
                p0.tree.list.add(p0);
                p0.tree.list.add(p1);
                p0.list.add(p1);
                p1.list.add(p0);
            }
            else if (p0 == null && p1 != null) {
                p0 = pa[ir[0]-1] = new P(ir[0]-1);
                p0.tree = p1.tree;
                p0.tree.list.add(p0);
                p0.list.add(p1);
                p1.list.add(p0);
            }
            else if (p0 != null && p1 == null) {
                p1 = pa[ir[1]-1] = new P(ir[1]-1);
                p1.tree = p0.tree;
                p1.tree.list.add(p1);
                p0.list.add(p1);
                p1.list.add(p0);
            }
            else {
                // ツリーの合体
                for(P p : p1.list) {
                    p.tree = p0.tree;
                }
                mori.remove(p1.tree);
                p0.tree.list.addAll(p1.tree.list);
                p1.tree = p0.tree;
                p0.list.add(p1);
                p1.list.add(p0);
            }
		}

        ir = readIntArray();
        int N2 = ir[0]; // 木の頂点数
        P[] tpa = new P[N2];
        Tree tree = new Tree();  // 見本木

        for(int i= 0; i < N2 - 1; i++) {
            ir = readIntArray();
            P p0 = tpa[ir[0]-1];
            P p1 = tpa[ir[1]-1];
            if (p0 == null && p1 == null) {
                p0 = tpa[ir[0]-1] = new P(ir[0]-1);
                p1 = tpa[ir[1]-1] = new P(ir[1]-1);
                p0.tree = p1.tree = tree;
                tree.list.add(p0);
                tree.list.add(p1);
                p0.list.add(p1);
                p1.list.add(p0);
            }
            else if (p0 == null && p1 != null) {
                p0 = tpa[ir[0]-1] = new P(ir[0]-1);
                p0.tree = tree;
                tree.list.add(p0);
                p0.list.add(p1);
                p1.list.add(p0);
            }
            else if (p0 != null && p1 == null) {
                p1 = tpa[ir[1]-1] = new P(ir[1]-1);
                p1.tree = tree;
                tree.list.add(p1);
                p0.list.add(p1);
                p1.list.add(p0);
            }
            else {
                p0.list.add(p1);
                p1.list.add(p0);
            }
        }
        log.printf("見本木 %d点 %s\n",  tree.list.size(), tree.toString());


        log.printf("森の木 %d\n", mori.size());
        int cnt = 0;
        for(int i = 0; i < mori.size(); i++) {
            Tree t = mori.get(i);
            log.printf(" %d点 %s\n",  t.list.size(), t.toString());
            if (doukei(tree, t)) {
                cnt++;
            }
        }

		System.out.printf("%d\n", cnt);


		return true; // 正常終了 次へ
	}


//	private final static boolean DEBUG = true;  // debug 　argsに何か書くとdebugになる
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG || args.length > 0) {
			log = System.out;

//			String inputStr = "6 4:1 2:2 3:2 4:5 6:4:2 3:3 1:3 4";
            String inputStr = "14 9:5 8:5 11:10 14:6 4:13 9:3 14:1 2:6 12:7 9:3:3 1:2 1";
//			inputStr += "0 0:";

			inputStr = inputStr.replace(":", "\n");

//			reader = new BufferedReader(new StringReader(inputStr));
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // 書き捨て
//            log = System.out;
			reader = new BufferedReader(new InputStreamReader(System.in)); // コンソールから
//            reader = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		}

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

//		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
//			if (!b)
//				break;
//		}

		reader.close();
	}


	static PrintStream log;
	static BufferedReader reader;


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



