import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char s[][] = new char[h + 2][w + 2];
        for (int i = 1; i < h + 1; i++) {
            String st = sc.next();
            for (int j = 1; j < w + 1; j++) {
                s[i][j] = st.charAt(j - 1);
            }
        }
        boolean pos = true;
        out: for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '#' && s[i - 1][j] != '#' && s[i + 1][j] != '#' && s[i][j - 1] != '#' && s[i][j + 1] != '#') {
                    pos = false;
                    break out;
                }
            }
        }
        if (pos) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}