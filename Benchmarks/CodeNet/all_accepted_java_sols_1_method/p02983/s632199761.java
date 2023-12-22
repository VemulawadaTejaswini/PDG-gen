import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong(), r = sc.nextLong();
        long res = Long.MAX_VALUE;
        r = Math.min(l + 2019L, r);
        for(long i = l; i <= r; i++) {
            for(long j = i + 1; j <= r; j++) {
                res = Math.min(res, (i * j) % 2019L);
            }
        }
        System.out.println(res);
    }
}
