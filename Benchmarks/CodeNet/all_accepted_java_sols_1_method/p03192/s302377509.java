import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        String s = Integer.toString(n);
        
        for (int i = 0; i < 4; i++) {
            if (s.charAt(i) == '2')
                ans ++;
        }
        
        System.out.println(ans);
    }
}