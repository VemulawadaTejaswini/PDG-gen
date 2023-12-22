import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        
        int amin = 99999999;
        int bmin = 99999999;
        int[] arraya = new int[a];
        for (int i = 0; i < a; i++) {
            arraya[i] = sc.nextInt();
            amin = Math.min(amin, arraya[i]);
        }
        int[] arrayb = new int[b];
        for (int i = 0; i < b; i++) {
            arrayb[i] = sc.nextInt();
            bmin = Math.min(bmin, arrayb[i]);
        }
        
        int best = amin+bmin;
        
        while (m-- > 0) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int s = sc.nextInt();
            
            best = Math.min(best ,arraya[x] + arrayb[y]-s);
        }
        
        System.out.println(best);
    }
}
