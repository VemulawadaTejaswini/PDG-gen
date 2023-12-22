import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = n;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                continue;
            }
            cnt = Math.min(cnt, i + (n / i) - 2);
        }
        System.out.println(cnt);
    }

}
