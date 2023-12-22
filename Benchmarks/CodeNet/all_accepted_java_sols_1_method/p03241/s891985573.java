import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = m / n;
        while (true) {
            if (m % d == 0) {
                System.out.println(d);
                return;
            }
            d--;
        }
    }
}