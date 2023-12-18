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
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int k = sc.nextInt();
            int t = (h2 * 60 + m2) - (h1 * 60 + m1);
            return t - k;
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
