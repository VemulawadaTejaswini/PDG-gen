import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ret = 0;
        for (int i = 1; i <= n; i++) {
            double tmp = 1.0 / n;
            int now = i;
            while (now < k) {
                now *= 2;
                tmp /= 2;
            }
            ret += tmp;
        }
        System.out.println(ret);
        sc.close();
    }
}