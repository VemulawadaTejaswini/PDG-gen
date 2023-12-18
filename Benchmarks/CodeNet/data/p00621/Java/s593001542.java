import java.io.*;
import java.util.*;

public class Main {
    boolean[] taken;
    int W, Q;
    Map<Integer, Integer> cat;
    Map<Integer, Integer> sleep;
    Scanner sc;

    Main() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    boolean process() {
        W = sc.nextInt();
        Q = sc.nextInt();
        if (W == 0 && Q == 0) return false;
        taken = new boolean[W+1];
        cat = new HashMap<Integer, Integer>();   // id, w
        sleep = new HashMap<Integer, Integer>(); // id, 睡眠開始位置

        for (int q = 0; q < Q; q++) {
            String s; int id, w;
            s = sc.next();
            if (s.equals("s")) {
                id = sc.nextInt();
                w = sc.nextInt();
                boolean can_sleep = false;
find_place:     for (int i = 0; i <= W-w; i++) {
                    if (!taken[i]) {
                        for (int j = 0; j < w; j++) 
                            if (taken[i+j]) 
                                continue find_place;
                        can_sleep = true;
                        for (int j = 0; j < w; j++) taken[i+j] = true;
                        cat.put(id, w);
                        sleep.put(id, i);
                        System.out.println(i);
                        break;
                    }
                }
                if (!can_sleep) System.out.println("impossible");
            } else {
                id = sc.nextInt();
//                System.out.println(id);
//                System.out.println(sleep);

                int place = sleep.get(id);
                System.out.println(place);
                for (int i = 0; i < cat.get(id); i++) 
                    taken[place+i] = false;
            }
        }
        System.out.println("END");
        return true;
    }                

    void run() {
        while (process()); //do nothing
    }
}