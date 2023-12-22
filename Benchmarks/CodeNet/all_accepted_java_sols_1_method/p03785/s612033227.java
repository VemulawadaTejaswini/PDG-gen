import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[][] range = new int[n][2];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            range[i][0] = val;
            range[i][1] = val+k;
        }

        Arrays.sort(range, Comparator.comparingInt(r -> r[0]));
        int count = 0;
        int used = 0;
        while (used < n) {
            int right = range[used][1];
            int c1 = 1;
            used++;
            while (c1 < c && used < n && range[used][0] <= right) {
                used++;
                c1++;
            }
            count++;
        }
        System.out.println(count);
    }
}