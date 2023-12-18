//Created by Aminul on 7/5/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        PriorityQueue<Long> pos = new PriorityQueue<>(),
                neg = new PriorityQueue<>();
        PriorityQueue<Long> posRev = new PriorityQueue<>(Collections.reverseOrder()),
                negRev = new PriorityQueue<>(Collections.reverseOrder());

        long mod = (long) 1e9 + 7;
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            long x = in.nextInt();
            if (x > 0) {
                pos.add(x);
                posRev.add(x);
            } else if (x < 0) {
                neg.add(x);
                negRev.add(x);
            } else hasZero = true;
        }

        if (pos.size() + neg.size() < k) {
            pw.println(0);
        } else {
            boolean isPositive = false;
            for (int i = 0; i <= neg.size() && i <= k; i += 2) {
                if (i + pos.size() >= k) {
                    isPositive = true;
                    break;
                }
            }
            
            if (!isPositive) {
                if (hasZero) pw.println(0);
                else {
                    long res = -1;
                    while (k > 0) {
                        if (!posRev.isEmpty() && !negRev.isEmpty()) {
                            if (abs(negRev.peek()) <= abs(posRev.peek())) {
                                res = mod(res * abs(negRev.poll()), mod);
                            } else {
                                res = mod(res * abs(posRev.poll()), mod);
                            }
                        } else if (!posRev.isEmpty()) {
                            res = mod(res * abs(posRev.poll()), mod);
                        } else {
                            res = mod(res * abs(negRev.poll()), mod);
                        }
                        k--;
                    }

                    pw.println(res);
                }
            } else {
                long res = 1;
                while (k > 0) {
                    if (k >= 2 && pos.size() >= 2 && neg.size() >= 2) {
                        long p1 = pos.poll(), p2 = pos.poll();
                        long n1 = neg.poll(), n2 = neg.poll();
                        if (p1 * p2 >= n1 * n2) {
                            res = (res * ((p1 * p2) % mod)) % mod;
                            neg.add(n1);
                            neg.add(n2);
                        } else {
                            res = (res * ((n1 * n2) % mod)) % mod;
                            pos.add(p1);
                            pos.add(p2);
                        }
                        k -= 2;
                    } else if (k >= 2 && neg.size() >= 2) {
                        long n1 = neg.poll(), n2 = neg.poll();
                        res = (res * ((n1 * n2) % mod)) % mod;
                        k -= 2;
                    } else if (pos.size() > 0) {
                        res = (res * pos.poll()) % mod;
                        k--;
                    }
                }

                pw.println(res);
            }
        }

        pw.close();
    }

    public static long mod(long a, long m) {
        long A = (a % m);
        return A >= 0 ? A : A + m;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}