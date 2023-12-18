import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0; j < a[i]; j++) {
                li.add(i + 1);
            }
        }
        int k = 0;
        int c[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                c[i][j] = li.get(k);
                k++;
            }
        }
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = w - 1; j > 0; j--) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println(c[i][0]);
            } else {
                for (int j = 0; j < w - 1; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println(c[i][w - 1]);
            }
        }
    }
}
