import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = b - a - 1;
        double x = (1 / 2.0) * n * (n + 1) - a;

        System.out.println((int) x);
    }
}