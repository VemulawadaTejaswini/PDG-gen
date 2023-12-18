import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt(), c = sc.nextInt();
        System.out.println(w * h / gcd(w, h) * c);
    }
    static int gcd(int a, int b) {
        return a % b == 0 ? b * b : gcd(b, a % b);
    }
}
