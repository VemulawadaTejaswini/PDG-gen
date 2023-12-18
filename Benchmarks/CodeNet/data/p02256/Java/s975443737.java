import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        greatestCommonDivisor(a, b);
    }

    private static void greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int mod = a % b;
            a = b;
            b = mod;
        }
        System.out.println(a);
    }
}

