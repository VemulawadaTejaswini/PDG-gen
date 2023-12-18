import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] road = new int[n];
        Arrays.fill(road, 0);
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            road[a[i] - 1]++;
            road[b[i] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(road[i]);
        }
    }
}
