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
            long result = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            ArrayList<Long> sum = new ArrayList<>(n);
            for (int i = 0; i <= n-k; i++) {
                if (i == 0) {
                    long suma = 1;
                    for (int j = 0; j < k; j++) {
                        suma *= a.get(j);
                    }
                    sum.add(suma);
                }
                if (i != 0) {
                    sum.add(sum.get(i-1) / a.get(i-1) * a.get(i+k-1));
                }
            }
            long latestScore = sum.get(0);
            for (int i = 1; i <= n-k; i++) {
                if (latestScore < sum.get(i)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                latestScore = sum.get(i);
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
