import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        long[] p = new long[n];
        long[] res = new long[n+1];
        Arrays.fill(res, Long.MAX_VALUE);
        for(int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        int pow = 1;
        for(int i=0; i<n; i++) {
            pow *= 3;
        }

        for(int i=0; i<pow; i++) {
            long sum = 0;
            int ind = 0;
            for(int j=0; j<n; j++) {
                int ii = i;
                int in = 0;
                long a = Math.min(Math.abs(x[j]) * p[j], Math.abs(y[j]) * p[j]);
                for(int k=0; k<n; k++) {
                    int num = ii % 3;
                    if(num == 1) {
                        a = Math.min(a, Math.abs(x[j]-x[k]) * p[j]);
                        in ++;
                    } else if (num == 2) {
                        a = Math.min(a, Math.abs(y[j]-y[k]) * p[j]);
                        in ++;
                    }
                    ii /= 3;
                }
                ind = in;
                sum += a;
            }
            res[ind] = Math.min(res[ind], sum);
        }

        for(int i=0; i<=n; i++) {
            System.out.println(res[i]);
        }


    }
}