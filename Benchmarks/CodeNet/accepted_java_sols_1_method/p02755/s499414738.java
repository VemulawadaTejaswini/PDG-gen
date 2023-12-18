import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            double aPrice = Math.floor(i * 0.08);
            double bPrice = Math.floor(i * 0.1);
            if (aPrice == a && b == bPrice) {
                System.out.println(i);
                break;
            } else if (aPrice > a || bPrice > b) {
                System.out.println(-1);
                break;
            }

        }
    }
}