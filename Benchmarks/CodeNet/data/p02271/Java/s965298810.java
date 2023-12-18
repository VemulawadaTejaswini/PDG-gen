
import java.util.*;
import java.lang.*;

public class Main {

    static int n;
    static int[] a;
    static HashSet<Integer> sums;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sums = new HashSet<>();
        bitFullSearch();
        
        int mnum = sc.nextInt();
        for (int i = 0; i < mnum; i++) {
            System.out.println(sums.contains(sc.nextInt()) ? "yes" : "no");
        }
        //System.out.println(sums);
    }
    
    static void bitFullSearch() {
        for (int i = 0; i < Math.pow(2, n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i >> j & 1) == 1) { // iのj桁目が立ってたら
                    sum += a[j];
                }
            }
            sums.add(sum);
        }
    }
}
