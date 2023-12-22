import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
            b.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        int max = a.stream().mapToInt(i -> i).max().getAsInt();
        int index = a.indexOf(max);
        int result = max + b.get(index);

        // 出力
        System.out.println(result);
    }
}
