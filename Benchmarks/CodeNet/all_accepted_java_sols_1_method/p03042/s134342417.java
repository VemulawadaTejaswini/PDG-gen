
import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int ans = 0;
        int f = Integer.parseInt(s.substring(0, 2));
        int l = Integer.parseInt(s.substring(2, 4));
        //System.out.println(f);
        //System.out.println(l);
        if (1 <= f && f <= 12 && 1 <= l && l <= 12) {
            System.out.println("AMBIGUOUS");
        } else if (1 <= f && f <= 12) {
            System.out.println("MMYY");
        } else if (1 <= l && l <= 12) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
        
        
    }
}