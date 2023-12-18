
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
    
    // 単純最小値(2倍)を返す
    int min() {
        int sum1 = 0;
        int sum2 = 0;
        int max1 = 0;
        int max2 = 0;
        
        for(int i = 0; i < N; i++) {
            if (T[i] > 0) {
                int t = T[i];
                sum1 += t;
                if (t > max1) {
                    max1 = t;
                }
            }
            else {
                int t = - T[i];
                sum2 += t;
                if (t > max2) {
                    max2 = t;
                }
            }
        }
        if (max1 * 2 - sum1 > 0) {
            sum1 += (max1 * 2 - sum1) * 2;
        }
        if (max2 * 2 - sum2 > 0) {
            sum2 += (max2 * 2 - sum2) * 2;
        }
//        if (sum % 2 != 0)
//            sum = -1;
//        else
//            sum /= 2;
        return sum1 + sum2;
    }
    
    int solv() {
        int res = 0;
        for(int j = 0; j < 2; j++) {
            int sum = 0;
            int max = 0;
            for(int i = 0; i < N; i++) {
                int t = T[i] * (j == 0 ? 1 : -1);
                if (t > 0) {
                    sum += t;
                    if (t > max) {
                        max = t;
                    }
                }
            }
            //log.printf("max sum %d %d\n", max, sum);
            if (sum % 2 == 1) {
                
                return -1;
            }
            if (max > sum / 2) {
                return -2;
            }
            res += sum / 2;
        }
        return res;
    }

    int sov() {
        int min = min();
        if (min % 2 != 0) {
            T[nidx - 1] -= M;
            min = min();
            log.printf("再 %s min=%d\n", Arrays.toString(T), min);
        }
        
        return min / 2;
        
    }
    
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
        int ret = 0;
        if (N == 2 && T[0] != T[1]) {
            ret = -1;
        }
        else if (N == 3 && T[0] == 1 || T[1] == 1 || T[2] == 1) {
            ret = 3;
        }
        else {
            Arrays.sort(T);
            nidx = -1; // 負になる場所
            for(int i = 0; i < N; i++) {
                if (T[i] > M / 2) {
                    if (nidx < 0)
                        nidx = i;
                    T[i] -= M;
                }
            }
            if (nidx < 0)
                nidx = M;
            log.printf("%s nidx = %d\n",  Arrays.toString(T), nidx);
            int min = min();
            log.printf("%s min = %.1f\n",  Arrays.toString(T), min() / 2.);
            if (M % 2 == 0 && min % 2 != 0) {
                ret = -1;
            }
            else {
                ret = sov();
            }
        }
//        if (ret == 0) {
            
            if (false) {
    
            ret = solv();
            log.printf("ret = %d\n", ret);
            
            for(;nidx < N;) {
                T[nidx] += M;
                nidx++;
                log.printf("%s\n", Arrays.toString(T));
                ret = solv();
                log.printf("ret = %d\n", ret);
            }
            }
        
//        if (ret == -1 && M % 2 == 1) {
//            int h; // 反転箇所 0 or -1
//            if (nidx == 0) {
//                h = 0;
//            }
//            else if (nidx == N - 1) {
//                h = -1;
//            }
//            else if (T[nidx - 1] > T[nidx] + M) {
//                h = -1;
//            }
//            else h = 0;
//            if (h == 0) {
//                T[nidx] += M;
//                nidx++;
//            }
//            else {
//                nidx--;
//                T[nidx] -= M;
//            }
//            log.printf("%s\n", Arrays.toString(T));
//            ret = solv();
//            log.printf("ret = %d\n", ret);
//        }
//        }
        result.printf("%d\n", ret);
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


