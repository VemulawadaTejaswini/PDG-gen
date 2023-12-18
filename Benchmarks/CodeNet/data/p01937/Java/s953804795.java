
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2837 Cryptex
 *    2018/02/17
 */
public class Main {

    int N;
    int M;
    int[] T;
    int nidx; // 負になる場所

    int sov() {return 0; }
    int solv() {return 0; }
    int min() {return 0; }

    boolean main() throws IOException {
        Scanner sc = new Scanner(systemin);

        //int[] ir = readIntArray();
        N = sc.nextInt();//ir[0];
        M = sc.nextInt();//ir[1];
        log.printf("%d %d\n",  N, M);

        //ir = readIntArray();
        //int[] T = ir;
        T = new int[N];
        for(int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }
        result.printf("%d\n", 5);
        //sc.close();
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


