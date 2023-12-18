import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    static Object run() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), q = sc.nextInt();
            ArrayList<Integer> c = new ArrayList<>();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int in = sc.nextInt();
                if (max < in) max = in;
                c.add(in);
            }
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt()-1, r = sc.nextInt()-1;
                HashSet<Integer> hs = new HashSet<>();
                for (int j = l; j <= r; j++) {
                    if (max == hs.size()) break;
                    hs.add(c.get(j));
                }
                System.out.println(hs.size());
            }
            return null;
        }
    }
}

class ChenNumberUtil {
    static Collection<Integer> getDivisors(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                al.add(i);
                if (n / i != i)
                    al.add(n / i);
            }
        }
        Collections.sort(al);
        return al;
    }
}

class ChenBitUtil {
    static int popCount(int bit) {
        return Integer.bitCount(bit);
    }

    static boolean isFlag(int bit, int i) {
        return 0 != (bit & (1 << i));
    }

    static int setTrue(int bit, int i) {
        return bit |= (1 << i);
    }

    static int setFalse(int bit, int i) {
        return bit &= ~(1 << i);
    }

    static int setReverse(int bit, int i) {
        return isFlag(bit, i) ? setFalse(bit, i) : setTrue(bit, i);
    }

    static int reverseAll(int bit) {
        return ~bit;
    }
}
