
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2837 Cryptex
 *    2018/02/17
 */
public class Main {


    boolean main() throws IOException {
        Scanner sc = new Scanner(systemin);

//        result.printf("%d\n", ret);
        sc.close();
        return false;
    }

    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
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


}


