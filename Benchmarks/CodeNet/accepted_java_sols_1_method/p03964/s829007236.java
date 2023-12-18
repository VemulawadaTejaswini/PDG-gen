import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long curA = sc.nextLong();
        long curB = sc.nextLong();
        
        long a = 0, b = 0;
        for(int i = 1; i < n; i++) {
            a = sc.nextLong();
            b = sc.nextLong();
            if(a >= curA && b >= curB) {
                curA = a;
                curB = b;
            } else {
                long rate = Math.max((curA + a - 1) / a, (curB + b - 1) / b);
                curA = a * rate;
                curB = b * rate;
            }
        }
        
        System.out.println(curA + curB);
    }
}
