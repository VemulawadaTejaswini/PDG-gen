import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[(n > k) ? n : k];

        for (int i = k - 1; i > 0; i--) {
            if (i * 2 >= k) {
                p[i - 1] = 1;
            } else {
                p[i - 1] = p[(2 * i) - 1] + 1;
            }
        }

        double result = 0.0;
        for (int i = 0; i < n; i++) {
            result += (1 / (double) n) * (Math.pow(2, -p[i]));
        }

        System.out.println(result);
    }
}
