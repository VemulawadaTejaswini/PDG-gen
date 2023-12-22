import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());   
        int[] h = new int[N];
        long[] sum = new long[N];
        
        h[0] = Integer.parseInt(sc.next());
        h[1] = Integer.parseInt(sc.next());
        sum[0] = 0;
        sum[1] = (max(h[0], h[1]) - min(h[0], h[1]));  
        
        if(N > 2) {
            for(int i = 2; i < N; i++) {
                h[i] = Integer.parseInt(sc.next());
                long saitan = 0;
                for(int j = i - K; j < i; j++) {
                    if(j < 0) {
                        j = 0;
                    }
                    if(j == 0 || j == i - K) {
                        saitan = max(h[i], h[j]) - min(h[i], h[j]) + sum[j];
                        continue;
                    }
                    
                    if(max(h[i], h[j]) - min(h[i], h[j]) + sum[j]  < saitan) {
                        saitan = max(h[i], h[j]) - min(h[i], h[j]) + sum[j];
                    }
                }
                sum[i] = saitan;
            }
        }
        System.out.println(sum[N-1]);
    }
    
    public static int max(int a, int b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static int min(int a, int b) {
        if(a >= b) {
            return b;
        }else {
            return a;
        }
    }
}