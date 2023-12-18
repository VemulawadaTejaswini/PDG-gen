import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        int[][] a = new int[n][m];
        int count = 0;
        int point = 0;
        for (int i = 0; i < n; i++) {
            point = 0;
            for (int j = 0; j < m; j++) {
                point += in.nextInt() * b[j];
            }
            point += c;
            if (point > 0) count++;
        }
        in.close();
        System.out.println(count);
    }
}
