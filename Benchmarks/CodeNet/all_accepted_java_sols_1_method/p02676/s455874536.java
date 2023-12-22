import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = Integer.parseInt(sc.next());
        String S = sc.next();
        if(S.length() <= k) System.out.println(S);
        else {
            String s = S.substring(0, k);
            System.out.println(s+"...");
        }
    }
}