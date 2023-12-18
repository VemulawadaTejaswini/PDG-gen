
import java.io.*;

/**
 * AIZU ONLINE JUDGE
 * 2700 Airport Codes
 *    2018/02/11
 */
public class Main {

    class AirPort {
        String name;
        String code;

        void calcCode() {
            String c = "";
            c += name.charAt(0);
            for(int i = 1; i < name.length(); i++) {
                if ("aiueo".indexOf(name.charAt(i - 1)) >= 0) {
                    c += name.charAt(i);
                }
            }
            code = c;
        }
    }

	// メイン return falseでおしまい
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int N = ir[0];
		if (N == 0)
		    return false;

		log.printf("N = %d\n", N);

		AirPort[] list = new AirPort[N];
		for(int i = 0; i < N; i++) {
		    list[i] = new AirPort();
	        list[i].name = systemin.readLine();
	        list[i].calcCode();
	        log.printf("%s %s\n", list[i].name, list[i].code);
		}

		int res = 0;
		loop:for(int i = 0; i < N; i++) {
		    for(int j = i + 1; j < N; j++) {
		        String s0 = list[i].code;
                String s1 = list[j].code;
                if (s0.equals(s1)) {
                    res = -1;
                    break loop;
                }
                int k;
		        for(k = 0; k < s0.length() && k < s1.length(); k++) {
		            if (list[i].code.charAt(k) != list[j].code.charAt(k))
		                break;
		        }
		        k++;
		        if (k > res) {res = k;}
		    }
		}
		result.printf("%d\n", res);

		return true; // 正常終了 次へ
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
//			log.printf("%s\n", s);
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // 突然空行を読むことがある。読み飛ばすとうまくいくらしい。。。。
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




