import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] c = new long[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt()-1;
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        long max = Long.MIN_VALUE;

        if(k < n * 2) {
            for(int s = 0 ; s < n; s ++) {
                int pos = s;
                long score = 0;
                for(int i=0; i<k; i++) {
                    pos = p[pos];
                    score += c[pos];
                    max = Math.max(max, score);
                }
            }
            System.out.println(max);
            return;
        }

        OUTER: for(int s = 0 ; s < n; s ++) {
            boolean[] v = new boolean[n];
            v[s] = true;
            long a = 0;
            long mm = Long.MIN_VALUE;
            long[] d = new long[n];
            int pos = s;
            for(int i=0; i<n; i++) {
                pos = p[pos];
                a += c[pos];
                mm = Math.max(mm, a);
                if(v[pos]) {
                    int kk = k - (i+1);
                    int ep = pos;
                    long b = 0;
                    long m2 = Long.MIN_VALUE;
                    for(int j=0; j<n; j++) {
                        pos = p[pos];
                        b += c[pos];
                        m2 = Math.max(m2, b);
                        if(pos == ep) {
                            int kkk = kk - (j+1);
                            int ll = j+1;
                            max = Math.max(max, mm);
                            max = Math.max(max, a + m2);
                            if(b > 0) {
                                int div = kkk / ll;
                                long score = a + div * b;
                                kk -= div * ll;
                                for(int q=0; q<kk; q++) {
                                    pos = p[pos];
                                    score += c[pos];
                                    max = Math.max(max, score);
                                }
                            }
                            continue OUTER;
                        }
                    }
                }
                v[pos] = true;
            }
        }
        System.out.println(max);

    }




}