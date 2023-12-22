import java.util.*;

class Main {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println(gcd(sc.nextInt(), sc.nextInt()));
            sc.close();
    }
    public static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
