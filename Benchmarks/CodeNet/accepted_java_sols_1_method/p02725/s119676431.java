import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dis = new int[n];
        arr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            dis[i - 1] = arr[i] - arr[i - 1];
        }
        dis[n - 1] = arr[0] - arr[n - 1] + k;
        Arrays.sort(dis);
        System.out.println(k - dis[n - 1]);
    }
}