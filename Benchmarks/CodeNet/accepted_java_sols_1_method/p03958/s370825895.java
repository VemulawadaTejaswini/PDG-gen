import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int k = 0;
    static int t = 0;
    static int[] a = null;
    
    public static void main(String[] args) throws Exception {
        k = sc.nextInt();
        t = sc.nextInt();
        
        a = new int[t];
        int aMax = 0;
        for(int i = 0; i < t; ++i) {
            a[i] = sc.nextInt();
            aMax = Math.max(aMax, a[i]);
        }
        
        int ans = Math.max(0, aMax - 1 - (k - aMax));
        System.out.println(ans);
    }
}
