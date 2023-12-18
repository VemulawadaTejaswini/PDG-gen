import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        // long a = sc.nextInt();
        // long b = sc.nextInt();
        // long c = sc.nextInt();
        // System.out.println(4 * a * b < (c - a - b) * (c - a - b) ? "Yes" : "No");
        BigInteger a = BigInteger.valueOf(sc.nextLong());
        BigInteger b = BigInteger.valueOf(sc.nextLong());
        BigInteger c = BigInteger.valueOf(sc.nextLong());
        System.out.println(c.compareTo(a.add(b))>0  && a.multiply(b).multiply(BigInteger.valueOf(4)).compareTo(c.subtract(b).subtract(a).pow(2))<0 ? "Yes" : "No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
