import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int[] apple = new int[n];
        for (int i = 0; i < n; i++) {
            apple[i] = l + i;
        }

        int min = Integer.MAX_VALUE;
        for (int a : apple) {
            if (min < 0) {
                min = Math.max(min, a);
            } else {
                min = Math.min(min, a);
            }
        }

        int sum = Arrays.stream(apple).sum();
        int result = sum - min;

        // 出力
        System.out.println(result);
    }
}
