import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int target = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            target = a[target - 1];
            count++;
            if (target == 2) {
                break;
            }
        }
        int result = target == 2 ? count : -1;

        // 出力
        System.out.println(result);
    }
}
