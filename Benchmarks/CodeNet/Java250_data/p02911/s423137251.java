import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        //int[] a = new int[n+1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<q;i++) {
            int t = sc.nextInt();
            int count = map.getOrDefault(t, 0);
            map.put(t, ++count);
        }

        for (int i = 1; i <= n;i++) {
            int score = k - q + map.getOrDefault(i, 0);
            if (score > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
