import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{
    //無駄な計算を抑えるやつ
    static int mopi(List<Long> list, long X, long K, long D) {
        if (X > 0 && X / D >= K) {
            list.add(X - D * K);
            return -1;
        }
        return 0;
    }

    static int walkingTakashi(List<Long> list, long X, long K, long D) {
        list.add(X);
        if (X < 0) X = abs(X);
        if (X == 0) return 0;
        if (mopi(list, X, K, D) != 0) return 0;

        long x = X;
        for (long i = K; i > 0; i--) {
            try {
                x -= D;
                list.add(abs(x));

                if (x == 0L) break;
                //xが0から遠ざかっているとき
                int MAX = list.size();
                if (abs(x) > abs(list.get(MAX - 2))) break;
                //xが負になったとき
                if (signum(x) < 0) break;

            } catch (ArithmeticException e) {
                // TODO: handle exception
                break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long X = std.nextLong();
        long K = std.nextLong();
        long D = std.nextLong();

        List<Long> list = new ArrayList<Long>();
        walkingTakashi(list, X, K, D);

        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
