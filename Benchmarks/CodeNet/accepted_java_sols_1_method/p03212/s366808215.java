import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        List<String> list = new ArrayList<>(Arrays.asList(new String[] { "3", "5", "7" }));
        for (int i = 0; i < 10000; i++) {
            String base = list.get(i);
            list.add(base + 3);
            list.add(base + 5);
            list.add(base + 7);
        }

        List<Long> longList = list.stream().filter(i -> i.contains("3") && i.contains("5") && i.contains("7"))
                .map(i -> Long.parseLong(i)).collect(Collectors.toList());

        int result = 0;
        for (int i = 0; i < longList.size(); i++) {
            if (longList.get(i) <= (long) n) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
