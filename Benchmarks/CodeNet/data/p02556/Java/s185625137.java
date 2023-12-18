import java.util.Scanner;

public class Main {
    
    private static final long MOD = 1_000_000_007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        final long[] x = new long[N];
        final long[] y = new long[N];
        final long[] a = new long[N];
        final long[] b = new long[N];
        
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            
            a[i] = x[i] + y[i];
            b[i] = x[i] - y[i];
        }
        
        long max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; i < N; i++) {
                long d1 = a[i] - a[j];
                long d2 = -a[i] + a[j];
                long d3 = b[i] - b[j];
                long d4 = -b[i] + b[j];
                
                long d = Math.max(Math.max(d1, d2), Math.max(d3, d4));
                if (max < d) {
                    max = d;
                }
            }
        }
        
        System.out.println(max);
    }
}
