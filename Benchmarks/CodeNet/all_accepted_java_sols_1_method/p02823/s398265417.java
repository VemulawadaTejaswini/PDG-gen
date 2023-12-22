import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            long A = sc.nextLong();
            long B = sc.nextLong();

            long ans;

            if ((B - A) % 2 == 0) {
                ans = (B - A) / 2;
            } else {
                long ans1 = (N - B) + 1 + (B - A - 1) / 2;
                long ans2 = (A - 1) + 1 + (B - A - 1) / 2;
                ans = Math.min(ans1, ans2);
            }

            System.out.println(ans);
        }
    }

}
