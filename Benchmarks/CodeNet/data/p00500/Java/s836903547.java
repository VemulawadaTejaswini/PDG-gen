import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] l = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                l[i][j] = sc.nextInt();
                l[i][3] += l[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != k && l[i][j] == l[k][j]) {
                        l[i][3] -= l[i][j];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(l[i][3]);
        }
    }
}
