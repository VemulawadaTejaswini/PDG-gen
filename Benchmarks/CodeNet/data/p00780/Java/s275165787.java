import java.util.BitSet;
import java.util.Scanner;
 
public class Main {
 
    static Scanner sc = new Scanner(System.in);
 
    static BitSet primes() {
        int SIZE = 1 << 15;
        BitSet ret = new BitSet(SIZE);
        ret.set(2, SIZE);
        for (int i = 2; i < SIZE; ++i) {
            if (!ret.get(i)) continue;
            for (int j = i * i; j < SIZE; j += i) {
                ret.clear(j);
            }
        }
        return ret;
    }
 
    public static void main(String[] args) {
        BitSet psset = primes();
        int[] ps = new int[psset.cardinality()];
        int idx = 0;
        for (int i = 0; i < psset.size(); ++i) {
            if (psset.get(i)) ps[idx++] = i;
        }
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            int ans = 0;
            for (int i = 0; i < ps.length && ps[i] <= N / 2; ++i) {
                if (psset.get(N - ps[i])) ++ans;
            }
            System.out.println(ans);
        }
    }
 
}