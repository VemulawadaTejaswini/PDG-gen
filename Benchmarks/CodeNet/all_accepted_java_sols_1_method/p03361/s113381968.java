import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] list = new String[h][w];

        for (int i = 0; i < h; i++) {
            list[i] = sc.next().split("");
        }

        String ans = "Yes";

        parent : for (int i = 0; i < h ; i++) {
            String[] target = list[i];
            for (int j = 0; j < w; j++) {
                if (target[j].equals("#")) {
                    // 上
                    if (i > 0 && list[i - 1][j].equals("#")) {
                        continue;
                    }
                    // 左
                    if (j > 0 && target[j - 1].equals("#")) {
                        continue;
                    }
                    // 右
                    if (j < w - 1 && target[j + 1].equals("#")) {
                        continue;
                    }
                    // 下
                    if (i < h - 1 && list[i + 1][j].equals("#")) {
                        continue;
                    }
                    ans = "No";
                    break parent;
                }
            }
        }

        System.out.println(ans);
    }
}