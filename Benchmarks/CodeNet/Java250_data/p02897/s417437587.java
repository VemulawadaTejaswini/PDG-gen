import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        sc.close();
        if (n % 2 == 0) {
            System.out.println((n / 2) / n);
        } else {
            System.out.println((((n + 1) / 2)) / n);
        }
    }
}
