
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        long ans = 1;
        long A[] = new long[N];
        long max = 1000000000000000000l;

        for(int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            if(A[i] == 0) {
                os.println(0);
                return;
            }
        }

        for(int i = 0; i < N; i++) {
            long digits = digits(A[i]);
            digits += digits(ans);

            if(digits > 18) {
                os.println(-1);
                return;
            }
            if(digits == 18) {
                int AFirst = fitstDigit(A[i]);
                int ansFirst = fitstDigit(ans);
                if(ansFirst != 1 || AFirst != 1){
                    os.println(-1);
                    return;
                }
            }
            ans *= A[i];
            if(ans > max) {
                os.println(-1);
                return;
            }
        }
        os.println(ans);

    }

    static int digits(long value) {
        int digits = 0;
        while(value/10 > 1){
            value /= 10;
            digits++;
        }
        return digits;
    }

    static int fitstDigit(long value) {
        while(value/10 > 1){
            value /= 10;
        }
        return (int)value;
    }
}