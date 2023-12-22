import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long max = Long.MIN_VALUE;

        List<Long> ab = new ArrayList<>();
        ab.add(a);
        if (a * b < 0) {
            ab.add(0L);
        }
        ab.add(b);
        List<Long> cd = new ArrayList<>();
        cd.add(c);
        if (c * d < 0) {
            cd.add(0L);
        }
        cd.add(d);

        for (long x: ab) {
            for (long y: cd) {
                max = Math.max(x * y, max);
            }
        }

        System.out.print(max);
    }
}
