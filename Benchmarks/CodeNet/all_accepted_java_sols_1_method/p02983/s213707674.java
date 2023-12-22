import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ins = sc.nextLine().split(" ");
        long l = Integer.parseInt(ins[0]);
        long r = Integer.parseInt(ins[1]);
        long s = l % 2019;
        long t = r % 2019;
        if (t <= s) {
            System.out.println(0);
            return;
        }
        if ((r - l) / 2019 >= 1) {
            System.out.println(0);
            return;
        }
        long result = Integer.MAX_VALUE;
        for (long i = s; i <= t; i++) {
            for (long j = i + 1; j <= t; j++) {
                result = Math.min(result, (i * j) % 2019);
            }
        }
        System.out.println(result);
    }
}