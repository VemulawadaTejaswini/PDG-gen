import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    static Object run() {
        try (Scanner sc = new Scanner(System.in)) {
            long n = Math.abs(sc.nextLong());
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++)
                l.add(sc.nextInt());

            long result = 0;

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        int l_i = l.get(i);
                        int l_j = l.get(j);
                        int l_k = l.get(k);
                        if (l_i == l_j || l_j == l_k || l_k == l_i)
                            continue;
                        if (l_i + l_j > l_k && l_j + l_k > l_i && l_k + l_i > l_j)
                            result++;
                    }
                }
            }
            return result;
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
