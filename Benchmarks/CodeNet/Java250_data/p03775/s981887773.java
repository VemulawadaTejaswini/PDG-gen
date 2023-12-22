import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                int a = String.valueOf(i).length();
                int b = String.valueOf(N / i).length();
                ans = Math.min(Math.max(a,b), ans);
            }
        }

        System.out.println(ans);
    }
}
