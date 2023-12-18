import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] range = new int[n][2];
        for(int i = 0;i < n;i++) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            range[i][0] = x - l;
            range[i][1] = x + l;
        }

        // 終端でソート
        Arrays.sort(range, (l, r) -> Integer.compare(l[1], r[1]));
        int count = n; 
        int r = range[0][1];
        for(int i = 1;i < n;i++) {
            if(range[i][0] < r) count--;
            else r = range[i][1];
        }

        System.out.println(count);
    }
}
