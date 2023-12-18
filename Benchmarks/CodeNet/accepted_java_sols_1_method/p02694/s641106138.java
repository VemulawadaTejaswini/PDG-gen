import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = 100;
        long k = sc.nextLong();
        for (int i = 0; i < 4000; i++) {
            double a = n * 1.01;
            n = (long)a;
            if (n >= k) {
                System.out.println(i+1);
                return;
            }
        }
    }
}
