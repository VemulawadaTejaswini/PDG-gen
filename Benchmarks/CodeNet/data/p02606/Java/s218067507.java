import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(solve(L, R, d));
    }

    private static int solve(int l, int r, int d) {
        int base = r / d - l / d;
        if (l % d == 0) base++;
        return base;
    }
}
