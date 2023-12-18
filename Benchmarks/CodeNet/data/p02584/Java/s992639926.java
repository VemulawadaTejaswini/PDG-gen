import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    static void walkingTakashi(List<Long> list, long X, long K, long D) {
        list.add(X);
        long x = X;
        /*
        if(X == 0) {
            if(K / 2 == 0) list.add(0L);
            else list.add(D);

        }
        if(abs(X) / D > K) {
            if(X > 0) list.add(X - D * K);
            else list.add(X + D * K);
        }
        if(abs(X) / D == K) list.add(0L);
        */
        for(long i = K; i > 0; i--) {
            try {
                x -= D;
                list.add(abs(x));
            } catch (ArithmeticException e) {
                // TODO: handle exception
                break;
            }
        }
        for(long i = K; i > 0; i--) {
            try {
                x += D;
                list.add(abs(x));
            } catch (ArithmeticException e) {
                // TODO: handle exception
                break;
            }
        }
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
