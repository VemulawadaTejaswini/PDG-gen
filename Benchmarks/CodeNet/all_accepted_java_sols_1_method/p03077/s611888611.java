import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long[] t = new long[5];

        long ans = 5;

        for (int i = 0; i < 5; i++) {
            t[i] = sc.nextLong();
        }

        Arrays.sort(t);

        sc.close();

        int num = n % t[0] != 0 ? 1 : 0;

        ans = (long) (Math.ceil(n / t[0]) + 4 + num);
        System.out.println(ans);
    }
}