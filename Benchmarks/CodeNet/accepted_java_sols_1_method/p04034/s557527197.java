import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[n];
        Arrays.fill(count, 1);
        boolean[] possible = new boolean[n];
        possible[0] = true;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (possible[x]) {
                possible[y] = true;
            }
            count[x]--;
            count[y]++;
            if (possible[x] && count[x] == 0) {
                possible[x] = false;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (possible[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}