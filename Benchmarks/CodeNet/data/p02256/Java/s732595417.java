import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
    }

    public static int gcd(int x, int y) {
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}

