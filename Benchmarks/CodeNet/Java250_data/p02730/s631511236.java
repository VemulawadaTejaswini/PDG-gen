import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String sub1 = s.substring(0, (n-1)/2);
        String sub2 = s.substring((n+3)/2-1, n);

        if (isP(s) && isP(sub1) && isP(sub2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
    
    private static boolean isP(String s){
      //System.out.println(s);
        int l = 0;
        int r = s.length()-1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
        
    }
}