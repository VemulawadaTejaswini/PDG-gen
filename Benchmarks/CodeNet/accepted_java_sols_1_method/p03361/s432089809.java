import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            s[i] = str.split("");
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int count = 0;
                if (s[i][j].equals("#")) {
                    try {
                        if (s[i - 1][j].equals("#"))
                            count++;
                    } catch (Exception e) {

                    }
                    try {
                        if (s[i][j - 1].equals("#"))
                            count++;
                    } catch (Exception e) {

                    }
                    try {
                        if (s[i][j + 1].equals("#"))
                            count++;
                    } catch (Exception e) {

                    }
                    try {
                        if (s[i + 1][j].equals("#"))
                            count++;
                    } catch (Exception e) {

                    }
                    if (count == 0) {
                        System.out.println("No");
                        return;
                    }
                } else
                    ;
            }
        }
        System.out.println("Yes");
    }
}
