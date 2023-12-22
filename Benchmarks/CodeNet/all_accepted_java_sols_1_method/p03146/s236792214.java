import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer s = Integer.parseInt(sc.next());

        // 主処理
        List<Integer> list = new ArrayList<>();
        list.add(s);

        int result = 0;
        boolean doContinue = true;
        for (int i = 0; doContinue; i++) {
            if (s % 2 == 0) {
                if (list.contains(s / 2)) {
                    result = i + 2;
                    doContinue = false;
                } else {
                    s = s / 2;
                    list.add(s);
                }
            } else {
                if (list.contains(3 * s + 1)) {
                    result = i + 2;
                    doContinue = false;
                } else {
                    s = 3 * s + 1;
                    list.add(s);
                }
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
