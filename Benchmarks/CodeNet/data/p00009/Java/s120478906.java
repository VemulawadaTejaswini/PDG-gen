import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int n =scanner.nextInt();
            int result = 0;

            if (n > 1) {
                result++;
            }
            for (int i = 3; i <= n; i += 2) {
                if (isPrime(i)) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
    public static boolean isPrime (int n) {
        for (int i = 3; i < n; i += 2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}