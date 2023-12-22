import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int maxRoot = (int) Math.sqrt(1000);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i <= maxRoot; i++) {
            int num = i * i;
            while (num <= 1000) {
                list.add(num);
                num *= i;
            }
        }
        Collections.sort(list);

        int result = 0;
        for (int num : list) {
            if (x < num) {
                break;
            }
            result = num;
        }

        // 出力
        System.out.println(result);
    }
}
