
import java.io.*;

/**
 * AIZU ONLINE JUDGE
 * 2837 Cryptex
 *    2018/02/17
 */
public class Main {


    boolean main() throws IOException {

        int[] ir = readIntArray();
        int N = ir[0];
        int M = ir[1];
        
        ir = readIntArray();
        int[] T = ir;

        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += Math.min(T[i], M - T[i]);
        }
        sum /= 2; 
        
        result.printf("%d\n", sum);

        return false;
    }

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


