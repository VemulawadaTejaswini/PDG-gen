import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int ans = 0;
        if(n % x == 0) {
            ans = n / x;
        }else {
            ans = n / x + 1;
        }
        System.out.println(t * ans);
    }
}
