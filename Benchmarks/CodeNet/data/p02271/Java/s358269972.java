import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;         
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = input.nextInt();
        Arrays.sort(a);
        int q = input.nextInt();
        for (int i = 0; i < q; ++i) {
            int m = input.nextInt();            
            if (canSumTo(m, a, 0)) System.out.println("yes");
            else System.out.println("no");
        }
    }                
    
    static boolean canSumTo(int x, int[] a, int fromIndex) {
        if (x == 0) return true;        
        for (int i = fromIndex; i < a.length; ++i) {
            if (a[i] <= x) {
                boolean ok = canSumTo(x - a[i], a, i + 1);
                if (ok) return true;
            }
        }
        return false;
    }
}