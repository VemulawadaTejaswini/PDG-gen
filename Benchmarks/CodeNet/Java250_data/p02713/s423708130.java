import java.util.Scanner;

class Main {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        int res = 0;
        int temp = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                temp = gcd(i, j);
                for (int k = 1; k < N + 1; k++) {
                    res += gcd(k, temp);
                }
            }
        }

        System.out.println(res);
    }
}