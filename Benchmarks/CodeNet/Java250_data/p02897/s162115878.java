import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float ans = 0;
        for (int i = 1; i <= N; i += 2) {
            ans++;
        }
        // 出力
        System.out.println(ans / N);
    }
}
