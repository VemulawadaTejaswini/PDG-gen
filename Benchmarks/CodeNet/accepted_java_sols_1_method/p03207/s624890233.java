import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] cakes = new int[n];
        for (int i = 0; i < n; i++) {
            cakes[i] = Integer.parseInt(sc.next());
        }
        // 最大値
        int max = 0;
        // 最大値のインデックス
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (cakes[i] > max) {
                max = cakes[i];
                index = i;
            }
            if (i == n -1) cakes[index] /= 2;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += cakes[i];
        }
        System.out.println(result);
    }
}
