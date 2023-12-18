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
        int sum = Arrays.stream(a).mapToInt(i -> i).sum();
        double ave = (double) sum / n;
        double minDist = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            double dist = Math.abs(a[i] - ave);
            if (dist < minDist) {
                minDist = dist;
                index = i;
            }
        }
        int result = index;

        // 出力
        System.out.println(result);
    }
}
