import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main (String args[]) {
        
        int ans = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        
        int max = 0;
        int maxnum = 0;
        
        for (int i = 0; i < n; i ++) {
            if (p[i] > max) {
                max = p[i];
                maxnum = i;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i != maxnum) {
                ans += p[i];
            }
        }
        
        ans += max/2;
	    
        System.out.println(ans);
    }
}