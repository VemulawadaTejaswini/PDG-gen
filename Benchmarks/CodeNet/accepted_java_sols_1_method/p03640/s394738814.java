import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                list.add(i + 1);
            }
        }
        List<String> line = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            line.add(Integer.toString(list.get(i)));
            if ((i + 1) % w == 0) {
                if ((i + 1) / w % 2 == 0) {
                    Collections.reverse(line);
                }
                System.out.println(String.join(" ", line));
                line.clear();
            }
        }

        // 出力
        sc.close();
    }
}
