import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    int n;

    Main() {
        sc = new Scanner(System.in);
    }

    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        return true;
    }

    void run() {
        while (init()) {
            Set<Integer> mod = new HashSet<Integer>();
            for (int i = 1; i < n; i++) {
                mod.add( (i*i) % n );
            }

            int[] count = new int[(n-1)/2+1];
            for (Integer a : mod) {
                for (Integer b : mod) {
                    if (a == b) continue;
                    int dif = a-b;
                    if (dif < 0) dif += n;
                    if (dif > (n-1)/2) dif = n - dif;
                    count[dif]++;
                }
            }

            for (int i = 1; i <= (n-1)/2; i++) 
                System.out.println(count[i]);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    void debug(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
 
    void print(String s){
        System.out.print(s);
    }
 
    void println(String s){
        System.out.println(s);
    }
}