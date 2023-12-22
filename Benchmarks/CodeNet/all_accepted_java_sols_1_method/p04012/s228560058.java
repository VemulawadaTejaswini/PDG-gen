import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        sc.close();

        // 主処理
        String[] arr = w.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                int index = list.indexOf(arr[i]);
                list.remove(index);
            } else {
                list.add(arr[i]);
            }
        }

        boolean judge = list.size() == 0;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
