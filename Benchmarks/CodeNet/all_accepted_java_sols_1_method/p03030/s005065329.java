import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            p[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = s[i] + String.format("%03d", Math.abs(100 - p[i])) + "," + String.format("%03d", i + 1);
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int index = Integer.parseInt(array[i].replaceAll(".*,", ""));
            array[i] = Integer.toString(index);
        }
        String result = String.join("\n", array);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
