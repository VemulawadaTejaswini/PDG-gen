import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tmp = n;
        int s = 0;
        while (n > 0) {
            s += n %10;
            n /= 10;
        }

        if (tmp % s == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}