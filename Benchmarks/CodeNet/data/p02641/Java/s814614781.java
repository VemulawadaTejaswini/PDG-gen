import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) arr[i] = 10123456;
        }
        for (int i = 0; i < n; i++) {
            dist[i] = Math.abs(arr[i] - x);
        }
        Arrays.sort(dist);
        for (int i = 0; i < n; i++) {
            if (dist[i] != (i + 1) / 2) {
                int a = x - (i + 1) / 2, b = x + (i + 1) / 2;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        System.out.println(a);
                        return;
                    } else if (arr[j] == a) {
                        System.out.println(b);
                        return;
                    }
                }
                System.out.println(a);
                return;
            }
        }
    }
}

