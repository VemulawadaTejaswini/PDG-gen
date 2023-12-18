import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        boolean flag = false;
        long result = 1;
        for (int i = 0; i < n; i++) {
            long next = in.nextLong();
            result *= next;
            if (result < 0 || result - (long) 1e18 > 0) flag = true;
        }
        if (flag && result == 0) System.out.println(0);
        if (flag && result != 0) System.out.println(-1);
        if (!flag) System.out.println(result);
    }
}