import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        long[] a = new long[N];
        for(int i=0; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        
        Arrays.sort(a);
        long max = a[0];
        long min = a[0];
        long ans = 1000000000;
        for(int i=0; i<N-K+1; i++) {
            min = a[i];
            max = a[i+K-1];
            if(ans > max-min) ans = max-min;
        }
        System.out.println(ans);
    }
}