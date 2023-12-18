import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[n];
        long m = (long)(Math.pow(10, 9) + 7);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextLong();
            sum += num[i];
            sum %= m;
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            sum -= num[i];
            if (sum < 0) {
                sum += m;
            }
            result += num[i] * sum;
            result %= m;
        }
        System.out.println(result);
    }

}
