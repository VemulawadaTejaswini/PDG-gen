import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ok = false;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if(s.equals("Y"))ok=true;
        }
        System.out.println(ok?"Four":"Three");
    }

    public static void main(String[] args) {
        new Main();
    }
}
