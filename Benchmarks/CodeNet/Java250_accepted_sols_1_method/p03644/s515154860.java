import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= N; i *= 2) {
            ans = Math.max(ans, i);
        }
        System.out.println(ans);
    }
}
