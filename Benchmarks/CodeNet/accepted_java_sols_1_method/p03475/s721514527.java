import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] c = new Integer[n - 1];
        Integer[] s = new Integer[n - 1];
        Integer[] f = new Integer[n - 1];
        for (int i = 0; i < n - 1; i++) {
            c[i] = Integer.parseInt(sc.next());
            s[i] = Integer.parseInt(sc.next());
            f[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int time = s[i];
            time += c[i];
            for (int j = i + 1; j < n - 1; j++) {
                time = Math.max(time, s[j]);
                int mod = (time - s[j]) % f[j];
                if (mod != 0) {
                    time += f[j] - mod;
                }
                time += c[j];
            }
            list.add(Integer.toString(time));
        }
        list.add("0");
        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }
}
