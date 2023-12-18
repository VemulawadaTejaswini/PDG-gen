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
            int k = sc.nextInt();
            ArrayList<Character> c = new ArrayList<>();
            boolean fastReturn = true;
            for (char ch : sc.next().toCharArray()) {
                if (ch == 'R') fastReturn = false;
                c.add(ch);
            }
            if (fastReturn) return 0;

            for (int count = 0;;count++) {
                int r = -1, current = k-1;
                for (; current >= 0; current--) {
                    if (c.get(current) == 'R') {
                        r = current;
                        break;
                    }
                }
                for (int i = 0; i < k; i++) {
                    if (i >= r) return count;
                    if (c.get(i) == 'W') {
                        Collections.swap(c, r, i);
                        break;
                    }
                }
            }
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
