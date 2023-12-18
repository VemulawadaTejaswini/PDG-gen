import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n / 2 + 1;
        if (n % 2 == 0) {
            double ans = (double) 1/ 2;
            System.out.println(ans);
        } else {
            double ans = (double) h/n;
            System.out.println(ans);
        }
    }
}
