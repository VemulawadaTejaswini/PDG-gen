import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(l);
        int max = Arrays.stream(l).max().getAsInt();
        int other = Arrays.stream(l).sum() - max;
        String result = max < other ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
