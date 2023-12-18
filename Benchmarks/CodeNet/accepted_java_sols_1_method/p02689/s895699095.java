import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] h = new int[n];
        h = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> ngList = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (h[a - 1] > h[b - 1]) ngList.put(b, 0);
            else if (h[a - 1] < h[b - 1]) ngList.put(a, 0);
            else {
                ngList.put(a, 0);
                ngList.put(b, 0);
            }
        }

        int ans = n - ngList.size();
        System.out.println(ans);
    }
}