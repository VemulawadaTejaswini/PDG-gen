import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
        }
        sc.close();

        // 主処理
        String head = "";
        for (int i = 0; i < w + 2; i++) {
            head += "#";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(head + "\n");
        for (int i = 0; i < h; i++) {
            String line = "#";
            for (int j = 0; j < w; j++) {
                line += a[i][j];
            }
            line += "#";
            sb.append(line + "\n");
        }
        sb.append(head);

        String result = sb.toString();

        // 出力
        System.out.println(result);
    }
}
