import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int[] counts = new int[10001];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    int num = i * i + j * j + k * k + i * j + j * k + k * i;
                    if (num <= 10000) {
                        counts[num]++;
                    }
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(Integer.toString(counts[i]));
        }
        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }
}
