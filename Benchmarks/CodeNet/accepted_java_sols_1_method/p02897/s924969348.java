import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int odd = (N + 1) / 2;
        double ans = (odd * 1.0) / N;

        System.out.printf("%.10f", ans);
    }
}
