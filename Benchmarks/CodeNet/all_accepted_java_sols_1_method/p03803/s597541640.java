import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        List<Integer> list = new ArrayList<>(
                Arrays.asList(new Integer[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1 }));
        String result;
        if (list.indexOf(a) < list.indexOf(b)) {
            result = "Bob";
        } else if (list.indexOf(a) > list.indexOf(b)) {
            result = "Alice";
        } else {
            result = "Draw";
        }

        // 出力
        System.out.println(result);
    }
}
