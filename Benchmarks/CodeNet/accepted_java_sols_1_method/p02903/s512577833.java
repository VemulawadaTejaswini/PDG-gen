import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] c = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if((i < b && j < a) || (b <= i && a <= j)) c[i][j] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                sb.append(c[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
