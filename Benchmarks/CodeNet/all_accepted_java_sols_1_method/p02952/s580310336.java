
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 1; i <= n; ++i) {
            if (i < 10) {
                res++;
            } else if (i >= 100 && i < 1000) {
                res++;
            } else if (i >= 10000 && i < 100000) {
                ++res;
            }
        }
        System.out.println(res);
    }
}
