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
        int[] color = new int[8];
        int over = 0;
        for (int rate : a) {
            if (rate < 400) {
                color[0] = 1;
            } else if (rate < 800) {
                color[1] = 1;
            } else if (rate < 1200) {
                color[2] = 1;
            } else if (rate < 1600) {
                color[3] = 1;
            } else if (rate < 2000) {
                color[4] = 1;
            } else if (rate < 2400) {
                color[5] = 1;
            } else if (rate < 2800) {
                color[6] = 1;
            } else if (rate < 3200) {
                color[7] = 1;
            } else {
                over++;
            }
        }
        int sum = Arrays.stream(color).sum();
        int min = Math.max(1, sum);
        int max = sum + over;
        String result = min + " " + max;

        // 出力
        System.out.println(result);
    }
}
