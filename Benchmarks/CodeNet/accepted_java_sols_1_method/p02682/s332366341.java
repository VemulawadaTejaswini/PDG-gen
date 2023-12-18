import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        
        int now = 0;
        if (a < k) {
            now = now + a;
            k -= a;
        } else {
            now = now + k;
            System.out.println(now);
            return;
        }
        if (b < k) {
            k -= b;
        } else {
            System.out.println(now);
            return;
        }
        if (c < k) {
            now = now - c;
            k -= c;
        } else {
            now = now - k;
            System.out.println(now);
            return;
        }
    }
}
