import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        for (long i = a; i <= b; i++) {
            if (i < a + k || b - k < i) {
                System.out.println(i);
            }
        }
    }
}