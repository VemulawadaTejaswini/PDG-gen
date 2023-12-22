import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int g = C > D ? gcd(C, D) : gcd(D, C);
        long k = (long) C*D/g;
        long result = B - (B/C + B/D - B/k) - (A-1 - ((A-1)/C + (A-1)/D - (A-1)/k));
        System.out.println(result);
    }

    private static int gcd(int a, int b) {
        int temp = 0;
        while (a % b != 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}