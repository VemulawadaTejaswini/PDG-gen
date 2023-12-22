import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] c = new int[3][3];
        int[] a = new int[3];
        int[] b = new int[3];

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                c[y][x] = sc.nextInt();
                if (y == 0)
                    b[x] = c[y][x];
                else
                    a[y] = c[y][x] - b[x];
            }
        }

        boolean isAns = true;
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (c[y][x] != a[y] + b[x]) {
                    isAns = false;
                    break;
                }
            }
        }

        System.out.println(isAns ? "Yes" : "No");
    }
}
