import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int GCD = GCD(a, b);
            int LCM = a / GCD * b;
            System.out.println(GCD + " " + LCM);
        }
        sc.close();
    }

    static int GCD(int a, int b) {
        if (a < b) {
            if (b % a == 0) {
                return a;
            } else {
                return GCD(a, b % a);
            }
        } else {
            if (a % b == 0) {
                return b;
            } else {
                return GCD(a % b, b);
            }
        }
    }
}
