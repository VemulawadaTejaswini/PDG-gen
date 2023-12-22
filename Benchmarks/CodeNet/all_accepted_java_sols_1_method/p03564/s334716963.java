import java.util.*;
import java.lang.*;

public class Main {
    
    static int n;
    static int k;
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int ans = 0;
        int num = 1;
        
        for (int i = 0; i < n; i++) {
            if (num * 2 < num + k) {
                num *= 2;
            } else {
                num += k;
            }
        }
        
        ans = num;
        
        System.out.println(ans);
    }
}

