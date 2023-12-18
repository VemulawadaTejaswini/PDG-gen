import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    //無駄な計算を抑えるやつ
    static boolean mopi(List<Long> list, long X, long K, long D) {
        if(X > 0 && X / D >= K) {
            list.add(abs(X - D * K));
            return true;
        }
        if(X < 0 && abs(X) / D >= K) {
            list.add(abs(X + D * K));
            return true;
        }
        return false;
    }

    static int walkingTakashi(List<Long> list, long X, long K, long D) {
        list.add(X);
        if (X != 0) {
            if(mopi(list, X, K, D)) return 0;
            long x = X;
            for (long i = K; i > 0; i--) {
                try {
                    x -= D;
                    list.add(abs(x));

                    if (x == 0)
                        break;
                    //0から遠ざかっているとき
                    if (abs(x) > abs(list.get(list.size() - 1)))
                        break;
                    //xが異符号になったとき
                    if (signum(x) != signum(list.get(list.size() - 1)))
                        break;

                } catch (ArithmeticException e) {
                    // TODO: handle exception
                    break;
                }
            }
            if (x != 0) {
                for (long i = K; i > 0; i--) {
                    try {
                        x += D;
                        list.add(abs(x));

                        if (x == 0)
                            break;
                        //0から遠ざかっているとき
                        if (abs(x) > abs(list.get(list.size() - 1)))
                            break;
                        //xが異符号になったとき
                        if (signum(x) != signum(list.get(list.size() - 1)))
                            break;

                    } catch (ArithmeticException e) {
                        // TODO: handle exception
                        break;
                    }
                }
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
