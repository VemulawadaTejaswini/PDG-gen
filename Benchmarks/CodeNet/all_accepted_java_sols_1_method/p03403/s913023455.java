import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            int amount = Math.abs(a[i - 1] - a[i]);
            sum += amount;
        }

        int[] minus = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            int left = a[i - 1];
            int right = a[i + 1];
            int center = a[i];
            if ((left < center && right < center)) {
                int max = Math.max(left, right);
                minus[i] = Math.abs(max - center) * 2;
            } else if (center < left && center < right) {
                int min = Math.min(left, right);
                minus[i] = Math.abs(min - center) * 2;
            }
        }

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int num = sum - minus[i];
            list.add(Integer.toString(num));
        }

        String result = String.join("\n", list);

        // 出力
        System.out.println(result);
    }
}
