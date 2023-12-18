import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += num[i] * num[j];
            }
        }
        double m = Math.pow(10, 9) + 7;
        long result = (long)(sum % m);
        System.out.println(BigDecimal.valueOf(result).toPlainString());
    }

}
