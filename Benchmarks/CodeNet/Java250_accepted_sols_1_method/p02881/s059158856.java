import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tmp1 = 0;
        long tmp2 = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                tmp1 = i;
                //if (i != n / i) {
                    tmp2 = n / i;
                //}
                if(tmp2 <= tmp1) break;
            }
        }
        long ans = tmp2 + tmp1 -2;
        System.out.println(ans);
    }
}