import java.util.*;

public class Main {
    private static final int MIN = -1000001;
    private static final int MAX = 1000001;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt(), n = MAX, x = MIN;
        long s = 0;
        for(int i = 0; i < d; i++) {
            int a = scn.nextInt();
            if(a < n) {
                n = a;
            }
            if(a > x) {
                x = a;
            }
            s += a;
        }
        System.out.println(n + " " + x + " " + s);
    }
}