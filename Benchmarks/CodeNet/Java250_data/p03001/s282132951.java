import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    // greed. No need for advanced structure. A simply deque would work.
    long solve(){
        Scanner sc = new Scanner(System.in);
        long W = sc.nextLong(), H = sc.nextLong(), x = sc.nextLong(), y = sc.nextLong();
        double w = (double) W, h = (double) H;
        System.out.print(String.format("%f ",w*h/2.0));
        boolean ans = W==x*2 && H == y*2;
        int res = ans?1:0;
        System.out.println(res);
        System.exit(0);
        return 0;
    }
}

