import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long count = 0;
        
        if (n * 2 == m) {
            count = n;
        } else if (n * 2 < m) {
            count = (n + m / 2) / 2;
        } else {
            count = m / 2;
        }
        
        System.out.println(count);
    }
}
