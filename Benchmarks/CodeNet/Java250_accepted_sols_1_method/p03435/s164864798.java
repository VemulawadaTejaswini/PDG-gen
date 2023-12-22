import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i <= c[0][0]; i++) {
            int b1 = c[0][0] - i;
            int b2 = c[0][1] - i;
            int b3 = c[0][2] - i;
            if (c[1][0] - b1 != c[1][1] - b2 || c[1][1] - b2 != c[1][2] - b3) {
                continue;
            }
            if (c[2][0] - b1 != c[2][1] - b2 || c[2][1] - b2 != c[2][2] - b3) {
                continue;
            }
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}