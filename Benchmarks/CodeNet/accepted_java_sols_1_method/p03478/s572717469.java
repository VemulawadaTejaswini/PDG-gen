import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::valueOf).sum();
            if (A <= sum && sum <= B) ans += i;
        }
        System.out.println(ans);
    }
}
