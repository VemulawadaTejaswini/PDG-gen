import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        a[0] = Long.parseLong(sc.next());
        long max = a[0];
        long min = a[0];
        for(int i=1; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
            if(max < a[i]) max = a[i];
            if(min > a[i]) min = a[i];
        }
        System.out.println(max-min);
    }
}