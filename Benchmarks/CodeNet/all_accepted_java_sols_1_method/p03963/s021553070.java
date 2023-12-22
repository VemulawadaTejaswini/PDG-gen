import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// ボールの数
        int k = sc.nextInt();// 色の数

        long pattern = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pattern *= k;
                continue;
            }

            pattern *= k-1;
        }

        System.out.println(pattern);
    }
}
