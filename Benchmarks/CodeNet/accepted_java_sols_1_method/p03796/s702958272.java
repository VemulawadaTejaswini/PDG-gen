import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long t = 1L;
        for (int i = 1; i <= n; i++) {
            t *= i;
            t %= (Math.pow(10, 9) + 7);
        }
        System.out.println((int)(t % (Math.pow(10, 9) + 7)));
    }
}
