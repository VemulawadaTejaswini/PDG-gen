import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        if (b+1 >= c) {
            System.out.println(n+1);
            return;
        }
        
        
        n = n - b + 1;
        
        // System.out.println(n);
        
        long tmp = b;
        if (n % 2 == 0) {
            tmp += (c - b) * (n / 2);
        } else {
            tmp += (c - b) * (n / 2);
            tmp++;
        }
        System.out.println(tmp);
    }
}
