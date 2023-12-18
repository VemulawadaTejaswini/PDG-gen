import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        for (int i = 1; i <= n; i++) {
            res += (long)i * f(i);
        }
        System.out.println(res);
    }

    private static int f(int i) {
        int res = 0;
        for (int j = 1; j * j <= i; j++) {
            if (i % j == 0) {
                if (j * j == i) {
                    res++;
                } else {
                    res+=2;
                }
            }
        }
        return res;
    }
}
