import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int p1 = sc.nextInt(), p2 = sc.nextInt(), p3 = 0;
        int cnt = 0;
        
        for (int i = 1; i < n - 1; i++) {
            p3 = sc.nextInt();
            //System.out.println(p1 + ", " + p2 + ", " + p3);
            
            if ((p1 < p2 && p2 < p3) || (p3 < p2 && p2 < p1)) {
                cnt++;
            }
            p1 = p2;
            p2 = p3;
        }
        System.out.println(cnt);
    }
}
