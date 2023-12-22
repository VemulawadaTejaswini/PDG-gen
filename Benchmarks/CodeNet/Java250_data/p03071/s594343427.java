import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans;
        if(a > b) {
            ans = a;
            a--;
        }else {
            ans = b;
            b--;
        }
        if(a > b) {
            ans += a;
            a--;
        }else {
            ans += b;
            b--;
        }
        System.out.println(ans);
        
    }
}