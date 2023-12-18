import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        long total = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt()-1;
            b[(int)a[i]]++;
        }
        for(int i = 0; i < n; i++){
            if(b[i] == 0) continue;
            c[i] = b[i] * (b[i]-1) / 2;
            total += c[i];
        };
        for(int i = 0; i < n; i++){
            int ai = (int)a[i];
            long alt = (b[ai]-1)*(b[ai]-2)/2;
            System.out.println(total - c[ai] + alt);
        }
    }
}