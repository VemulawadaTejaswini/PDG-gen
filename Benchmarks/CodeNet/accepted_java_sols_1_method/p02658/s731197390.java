import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(sc.next()));
        }
        sc.close();

        // 主処理
        long MAX = 1000000000000000000L;
        long num = 1;
        long result = 0;

        for (int i = 0; i < n; i++) {
            if ((double) MAX / list.get(i) < num) {
                result = -1;
                break;
            }
            num *= list.get(i);
        }

        if (result != -1 && num <= MAX) {
            result = num;
        } else {
            result = -1;
        }

        if (list.contains(0L)) {
            result = 0;
        }

        // 出力
        System.out.println(result);
    }
}
