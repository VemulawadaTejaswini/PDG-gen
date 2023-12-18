import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        Integer ll = a.length();
        Integer ans = 0;
        
        for (int i=0;i<ll;i++) {
            if (!a.substring(i,i+1).equals(b.substring(i,i+1))) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}