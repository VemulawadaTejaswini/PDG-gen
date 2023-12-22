import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ab = new int[m][2];
        for (int i = 0; i < m; i++) {
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        Arrays.sort(ab, Comparator.comparingInt(a -> a[0]));
        int min = Integer.MAX_VALUE;
        int cnt = 1;
        for (int i = 0; i < m; i++) {
            if (ab[i][0] >= min) {
                cnt++;
                min = ab[i][1];
                continue;
            }
            min = Math.min(min, ab[i][1]);
        }
        System.out.println(cnt);
    }

}
