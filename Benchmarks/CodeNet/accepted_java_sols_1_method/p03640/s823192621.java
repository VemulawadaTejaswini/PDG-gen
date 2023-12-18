import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] c = new int[h][w];
        int idx = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int j2 = i%2==0 ? j : w-1-j;
                c[i][j2] = idx+1;
                if(--a[idx] == 0) idx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                sb.append(c[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
