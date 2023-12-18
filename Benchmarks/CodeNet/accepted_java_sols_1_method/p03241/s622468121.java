import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m % n == 0) {
            System.out.println(m / n);
            return;
        }

        int max = m / n;

        while (true) {
            int amari = m - max * n;
            if (amari % max == 0) {
                System.out.println(max);
                return;
            }
            max--;
        }
    }
}