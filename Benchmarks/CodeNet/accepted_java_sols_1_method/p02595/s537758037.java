import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long d = sc.nextLong();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            long tmp1 = sc.nextLong();
            long tmp2 = sc.nextLong();
            long dis = tmp1 * tmp1 + tmp2 * tmp2;
            if (dis <= d * d) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}