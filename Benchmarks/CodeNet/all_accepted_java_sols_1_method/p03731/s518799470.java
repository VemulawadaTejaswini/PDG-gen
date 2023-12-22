

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long T = Long.parseLong(sc.next());
        long[] t = new long[N];
        long stop = 0;
        
        t[0] = Long.parseLong(sc.next());
        for(int i=1; i<N; i++) {
            t[i] = Long.parseLong(sc.next());
            if(t[i] - t[i-1] > T) {
                stop += t[i] - t[i-1] - T;
            }
        }
        long sum = t[N-1]+T;
        System.out.println(sum - stop);
        
    }   
}
