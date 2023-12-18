import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * Main.func(i));
        }
        System.out.println(sum);


    }

    public static int func(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}
