import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int principal = 100000;
        int result = principal;

        for (int i = 0; i < n; i++) {
            result *= 1.05;
            int remainder = result % 1000;
            if ( remainder != 0) {
                result += 1000-remainder;
            }
        }
        System.out.println(result);
    }
}