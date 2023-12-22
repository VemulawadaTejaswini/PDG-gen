import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = i + a[i];
            if(!map.containsKey(x)) map.put(x, 0);
            map.put(x, map.get(x) + 1);
        }
        long ans = 0L;
        for (int i = 1; i < n; i++) {
            int x = i - a[i];
            if(map.containsKey(x)) ans += map.get(x);
        }
        System.out.println(ans);
        sc.close();

    }

}
