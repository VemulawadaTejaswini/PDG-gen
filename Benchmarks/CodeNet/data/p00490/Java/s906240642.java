import java.util.Scanner;

public class Main {
    static int cal[];
    static int n;
    static int a;
    static int b;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();
        cal = new int[n];
        for (int i = 0; i < n; i++) {
            cal[i] = sc.nextInt();
        }
        System.out.println((int)solve(0, 0, c));
    }

    public static double solve(int m, int c, int sum) {
        if (n == m)
            return 1.0 * sum / (a + c * b);
        return Math
                .max(solve(m + 1, c, sum), solve(m + 1, c + 1, sum + cal[m]));
    }
}