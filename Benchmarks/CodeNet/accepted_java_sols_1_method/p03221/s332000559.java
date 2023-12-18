import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] list = new int[m][3];
        for (int i = 0; i < m; i++) {
            list[i][0] = scan.nextInt();
            list[i][1] = scan.nextInt();
            list[i][2] = i;
        }
        int[] n_cnt = new int[n];
        String[] ans = new String[m];
        Arrays.sort(list, (a, b) -> a[1] - b[1]);
        for (int i = 0; i < m; i++) {
            ans[list[i][2]] = String.format("%06d%06d", list[i][0], ++n_cnt[list[i][0] -1]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }
}