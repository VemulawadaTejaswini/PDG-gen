import java.util.Scanner;

public class Main {

    static final int MOD = 2019;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long L = sc.nextInt();
        long R = sc.nextInt();

        R = Math.min(R, L + 2019); //Rを狭めても結果は一緒　2019を2週すれば同じmodが2個以上取れるのでi<jの場合も対応可能
        long ans = 2018;

        for (long i = L; i <= R; i++) {
            for (long j = i + 1; j <= R; j++) {
                long x = i * j % 2019;
                ans = Math.min(ans, x);
            }
        }

        System.out.println(ans);

    }

}
