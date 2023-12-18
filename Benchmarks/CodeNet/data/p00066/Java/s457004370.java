import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        char bor[][] = new char[3][3];

        while (sc.hasNext()) {
            char[] tmps = sc.nextLine().toCharArray();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    bor[i][j] = tmps[i * 3 + j];
                }
            }

            char ans = 'u';
            for (int i = 0; i < 3; i++) {
                if (bor[i][0] == bor[i][1] && bor[i][0] == bor[i][2]) {
                    if (bor[i][0] == 'o') {
                        ans = 'o';
                        break;
                    } else if (bor[i][0] == 'x') {
                        ans = 'x';
                        break;
                    } else
                        continue;
                }
            }
            if (ans != 'u') {
                System.out.println(ans);
                continue;
            }

            for (int i = 0; i < 3; i++) {
                if (bor[0][i] == bor[1][i] && bor[0][i] == bor[2][i]) {
                    if (bor[0][i] == 'o') {
                        ans = 'o';
                        break;
                    } else if (bor[0][i] == 'x') {
                        ans = 'x';
                        break;
                    } else
                        continue;
                }
            }
            if (ans != 'u') {
                System.out.println(ans);
                continue;
            }
            if (bor[0][0] == bor[1][1] && bor[0][0] == bor[2][2]) {
                char j = bor[0][0];
                if (j == 'o')
                    ans = 'o';
                else if (j == 'x')
                    ans = 'x';
            }

            if (ans != 'u') {
                System.out.println(ans);
                continue;
            }

            if (bor[0][2] == bor[1][1] && bor[0][2] == bor[2][0]) {
                char j = bor[1][1];
                if (j == 'o')
                    ans = 'o';
                else if (j == 'x')
                    ans = 'x';
            }

            if (ans != 'u') {
                System.out.println(ans);
            } else
                System.out.println("d");

        }
    }
}