
import java.io.*;
import java.util.*;



// Volume5-0509 Sheets Main5_0509
public class Main {

    class Rect {
        int x0;
        int y0;
        int x1;
        int y1;
    }

    class Range {
        Range(int x, int f) {
            this.x = x;
            this.f = f;
        }
        int x;
        int f;   // f = 1:start f = -1:end
    }

	// メイン return falseでおしまい
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int n = ir[0];
		int r = ir[1]; // 1面積 2 面積:周長
		if (n == 0)
		    return false;

        log.printf("n = %d r = %d\n", n, r);
		Rect[] rects = new Rect[n];
		for(int i = 0; i < n; i++) {
			ir = readIntArray();
			rects[i] = new Rect();
			rects[i].x0 = ir[0];
            rects[i].y0 = ir[1];
            rects[i].x1 = ir[2];
            rects[i].y1 = ir[3];
		}

        int slen = 0; // 周長
        int s = 0; // 面積

        for(int xy = 0; xy < 2; xy++) {
            log.printf("xy = %d\n",  xy);
            /// xy逆にしてもう一度
            if (xy != 0) {
                for(int i = 0; i < n; i++) {
                    int t;
                    t = rects[i].x0;
                    rects[i].x0 = rects[i].y0;
                    rects[i].y0 = t;
                    t = rects[i].x1;
                    rects[i].x1 = rects[i].y1;
                    rects[i].y1 = t;
                }
            }

          Set<Integer> ySet = new TreeSet<Integer>();
        for(int i = 0; i < n; i++) {
            ySet.add(rects[i].y0);
            ySet.add(rects[i].y1);
		}
		Integer[] ya = ySet.toArray(new Integer[0]);
        //System.out.printf("ya.length = %d sort\n", ya.length);
		Arrays.sort(ya);
        //System.out.printf("ya.length = %d sort end\n", ya.length);
        
        List<Range> rangeList = new ArrayList<Range>();
        
		for(int i = 0; i < ya.length - 1; i++) {
            //log.printf("y=%d\n", ya[i]);
            int height = ya[i + 1] - ya[i];

		    for(int k = 0; k < n; k++) {
		        if (rects[k].y0 == ya[i]) { // 上端
		            rangeList.add(new Range(rects[k].x0, 1));
		            rangeList.add(new Range(rects[k].x1, -1));
		        }
		        else if (rects[k].y1 == ya[i]) { // 下端
		            for(int j = 0;; j++) {
		                if (rangeList.get(j).x == rects[k].x0 && rangeList.get(j).f == 1) {
		                    rangeList.remove(j);
		                    break;
		                }
		            }
                    for(int j = 0;; j++) {
                        if (rangeList.get(j).x == rects[k].x1 && rangeList.get(j).f == -1) {
                            rangeList.remove(j);
                            break;
                        }
                    }
		        }
		    }
		    Collections.sort(rangeList, new Comparator<Range>() {
                @Override
                public int compare(Range o1, Range o2) {
                    if (o1.x == o2.x) {
                        return o2.f - o1.f;
                    }
                    return o1.x - o2.x;
                }});
		    int c = 0;
		    int cx = 0;
		    for(Range ra : rangeList) {
		        if (ra.f > 0) {
		            c++;
		            if (c == 1) {
		                cx = ra.x;
		            }
		        }
		        else {
		            c--;
		            if (c == 0) {
		                //log.printf("面積=%d\n", (ra.x - cx) * h);
		                s += (ra.x - cx) * height;
                        slen += height * 2;
		            }
		        }
		    }
		}
        }

		System.out.printf("%d\n", s/2);
        if (r == 2) System.out.printf("%d\n", slen);


		return true; // 正常終了 次へ
	}


//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;

			//String inputStr = "5 1:0 0 3 2:1 1 2 5:0 4 6 5:3 3 5 6:5 0 7 6:";
            String inputStr = "5 2:0 0 3 2:1 1 2 5:0 4 6 5:3 3 5 6:5 0 7 6:";
            //String inputStr = "2 2:0 0 8 9: 0 0 9 8:";
            //String inputStr = "3 2:2 2 8 8:3 0 4 9:5 0 7 9:";
			inputStr += "0 0:";

			inputStr = inputStr.replace(":", "\n");

			reader = new BufferedReader(new StringReader(inputStr));
		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // 書き捨て
//            log = System.out;
			reader = new BufferedReader(new InputStreamReader(System.in)); // コンソールから
//            reader = new BufferedReader(new InputStreamReader(new FileInputStream("5_0509in.txt")));
		}

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}

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



