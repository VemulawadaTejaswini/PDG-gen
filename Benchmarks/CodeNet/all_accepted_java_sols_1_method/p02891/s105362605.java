import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long rep = sc.nextInt();
        char[] sq = S.toCharArray();
        long a1 = 0;
        for (int i = 1; i < sq.length; i++) {
            if (sq[i - 1] == sq[i]) {
                sq[i] = '.';
                a1++;
            }
        }
        if(rep==1){
            System.out.println(a1);
        }else if (sq[0] == sq[sq.length - 1]) {
            String S2 = new String(sq) + S;
            long a2 = 0;
            char[] sq2 = S2.toCharArray();
            for (int i = sq.length; i < sq2.length; i++) {
                if (sq2[i - 1] == sq2[i]) {
                    sq2[i] = '.';
                    a2++;
                }
            }

            if(sq2[0]==sq2[sq2.length-1]){
                // String S3 = new String(sq2) + S;
                // long a3 = 0;
                // char[] sq3 = S3.toCharArray();
                // for (int i = sq2.length; i < sq3.length; i++) {
                //     if (sq3[i - 1] == sq3[i]) {
                //         sq3[i] = '.';
                //         a3++;
                //     }
                // }
                System.out.println( a1 + a2*(rep-1) );
            }else{
                System.out.println( (a1+a2)*(rep/2) + a1 * (rep%2) );
                //ans = ans * (rep / 2) + a1 * (rep % 2);
            }
        } else {
            System.out.println(a1*rep);
        }
    }
}
