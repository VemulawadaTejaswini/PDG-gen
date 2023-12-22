import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grid = new int[n];
        for (int i = 0; i < n; i++) {
            grid[i] = sc.nextInt();
        }
        int num = n - 1;
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            if (grid[i] >= grid[i + 1]) {
                cnt++;
            } else {
                cnt = 0;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }    
}
