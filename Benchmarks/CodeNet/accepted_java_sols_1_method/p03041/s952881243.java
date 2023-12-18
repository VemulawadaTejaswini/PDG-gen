
import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        String ans = "";
        
        for (int i = 0; i < n; i++) {
            //System.out.println(s.charAt(i));
            if (i == k - 1) {
                ans += Character.toLowerCase(s.charAt(i));
                //System.out.println(Character.toLowerCase(s.charAt(i)));
            } else {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}