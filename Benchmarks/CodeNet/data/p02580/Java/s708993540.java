import java.awt.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        long time = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();


        Map<Point, Boolean> map = new HashMap<>();
        int[] hcount = new int[h];
        int[] wcount = new int[w];

        for (int i = 0; i < m; i++) {
            int h1 = sc.nextInt() - 1;
            int w1 = sc.nextInt() - 1;
            map.put(new Point(h1, w1), true);
            hcount[h1]++;
            wcount[w1]++;
        }


        int hmax = 0;
        for (int i = 0; i < h; i++) {
            hmax = Math.max(hmax, hcount[i]);
        }
        int wmax = 0;
        for (int i = 0; i < w; i++) {
            wmax = Math.max(wmax, wcount[i]);
        }

        //System.out.println("hmax = " + hmax);
        //System.out.println("wmax = " + wmax);

        for (int i = 0; i < h; i++) {
            if(hcount[i] != hmax){
                continue;
            }
            for (int j = 0; j < w; j++) {
                if(wcount[j] != wmax){
                    continue;
                }
                if(!map.containsKey(new Point(i, j))){
                    System.out.println(hmax + wmax);
                    return;
                }
                if(System.currentTimeMillis() - time > 2900){
                    System.out.println(hmax + wmax - 1);
                }
            }
        }

        System.out.println(hmax + wmax - 1);

    }

}
