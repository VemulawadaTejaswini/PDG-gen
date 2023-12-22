import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        if (k <= a) {
            System.out.println(k);
            return;
        }
        
        if (a + b >= k) {
            System.out.println(a);
            return;
        }

        int c2 = k - a - b;
        System.out.println(a - c2);
    }
}