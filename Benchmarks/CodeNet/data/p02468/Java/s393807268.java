import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        int mod = 1000000007;

        System.out.println(pow(m, n, mod));
    }

    //return a^b mod M O(logB)
    private static long pow(long a, long b, int M) {
        long ret = 1;
        long tmp = a;
        while (b > 0) {
            if ((b & 1) == 1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b >> 1;
        }
        return ret;
    }
}
