import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        int sqrt = (int) Math.sqrt(n);

        for (int i = sqrt; i >= 1 ; i--) {
            if (n % i == 0) {
                System.out.println(i + n / i - 2);
                break;
            }
        }
    }
}
