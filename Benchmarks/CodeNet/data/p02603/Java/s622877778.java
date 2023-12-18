//Created by Aminul on 7/25/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long amount = 1000, stocks = 0, res = 1000, lastPrice = 500;

        for (int i = 0; i < n; i++) {
            long x = in.nextInt();
            if(x == lastPrice) {
                continue;
            }
            else if(x > lastPrice) {
                amount += (x * stocks);
                res = max(res, amount);
                stocks = amount / x;
                amount %= x;
            } else {
                amount += (lastPrice * stocks);
                stocks = amount / x;
                amount %= x;
            }
            lastPrice = x;
        }

        pw.println(res);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}