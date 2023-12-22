import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long min = 2018;
        r = Math.min(r, Math.min(r, l + 2019));
        for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                if (i % 2019 == 0) {
                    System.out.println(0);
                    return;
                }
                min = Math.min(min, (i * j) % 2019);
            }
        }
        System.out.println(min);
    }

}
