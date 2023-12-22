import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextInt();
        long r = in.nextInt();

        long min = Long.MAX_VALUE;
        for (long i = l; i <= Math.min(r, l + 2019) ; i++) {
            for (long j = l; j <= Math.min(r, l + 2019); j++) {
                if (i == j) continue;

                min = Math.min(min, (i * j) % 2019);
            }
        }

        System.out.println(min);
    }
}