public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        final long A = sc.nextLong();
        final long B = sc.nextLong();
        final long C = sc.nextLong();
        final long D = sc.nextLong();

        System.out.println(B - A + 1 - MyLib.countMultiples(A, B, C) - MyLib.countMultiples(A, B, D) + MyLib.countMultiples(A, B, MyLib.lcm(C, D)));
    }
}

class MyLib {
    public static int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static long gcd(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static long countMultiples(long min, long max, long base) {
        return max / base - (min - 1) / base;
    }
}