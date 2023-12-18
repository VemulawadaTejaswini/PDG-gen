import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(Math.max(x, y), Math.min(x, y)));
        sc.close();
    }

    static int gcd(int x, int y) {
        while (y > 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
