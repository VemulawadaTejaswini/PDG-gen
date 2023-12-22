import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            // スキップ
            scan.nextLine();

            // 検索対象をmapに格納する
            Map<String, String> map = new HashMap<String, String>();
            for (String num : scan.nextLine().split(" ")) {
                map.put(num, "");
            }

            // スキップ
            scan.nextLine();

            // 検索対象が存在する場合はカウントする
            int count = 0;
            for (String num : scan.nextLine().split(" ")) {
                if (map.containsKey(num)) {
                    count += 1;
                }
            }

            System.out.println(count);
        }

    }

}

