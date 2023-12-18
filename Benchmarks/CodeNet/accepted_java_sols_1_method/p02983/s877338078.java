import java.util.Scanner;

import static java.lang.Math.min;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();
        long minValue = 2018;
        long v;
        long i,j;

//        System.out.println(l + " : " + r);

        r = min(r, l+4038);
        i=0;j=0;
        for(i=l;i<r;i++) {
            for(j=i+1;j<=r;j++) {
                v = (i*j)%2019;
//                v = floorMod(((long)l*(long)j), 2019);

//                System.out.println("[" + i + ", " + j + "] " + v);
                minValue = min(minValue, v);
                if (minValue == 0) { break; }
            }
            if (minValue == 0) { break; }
        }
//        System.out.println("[" + i + ", " + j + "]");
        // 出力
        System.out.println((int)minValue);
    }
}