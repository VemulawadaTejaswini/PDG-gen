import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int total = l * n + n * (n - 1) / 2;
        if (l >= 0) {
            System.out.println(total - l);
        } else {
            if (Math.abs(l) < n) {
                System.out.println(total);
            } else {
                System.out.println(total - (l + n - 1));
            }
        }
    }
}
