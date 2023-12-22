import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] h = new int[N];
        long[] min = new long[N];
        
        h[0] = Integer.parseInt(sc.next());
        h[1] = Integer.parseInt(sc.next());
        min[0] = 0;
        min[1] = zetta(h[0], h[1]);
        
        if(N > 2) {
            for(int i = 2; i < N; i++) {
                h[i] = Integer.parseInt(sc.next());
                if(zetta(h[i], h[i-1])+ min[i-1] > zetta(h[i], h[i-2]) + min[i-2]) {
                    min[i] = zetta(h[i], h[i-2]) + min[i-2];
                }else {
                    min[i] = zetta(h[i], h[i-1]) + min[i-1];
                }
            }
        }
        System.out.println(min[N-1]);
    }
    
    public static int zetta(int a, int b) {
        if(a >= b) {
            return a - b;
        }else {
            return b - a;
        }
    }
}