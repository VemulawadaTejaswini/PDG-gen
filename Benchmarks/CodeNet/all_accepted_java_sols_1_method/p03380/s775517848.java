import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        a.sort(Collections.reverseOrder());
        int base = a.get(0);
        int center = (int) Math.ceil(base / 2.0);

        List<Integer> diff = new ArrayList<>();
        for (int i = 1; i < a.size(); i++) {
            diff.add(Math.abs(center - a.get(i)));
        }

        int min = diff.stream().mapToInt(i -> i).min().orElse(0);
        int index = diff.indexOf(min) + 1;

        String result = base + " " + a.get(index);

        // 出力
        System.out.println(result);
    }
}
