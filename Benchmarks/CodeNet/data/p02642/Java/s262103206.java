import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            int count = map.getOrDefault(a[i], 0);
            map.put(a[i], ++count);
        }

        int count = n;
        for (int i = 0; i < n; i++) {
            if (map.getOrDefault(a[i], 0) > 1) {
                count--;
                continue;
            }
            if (a[i] == 1 && map.getOrDefault(a[i], 0) > 1) {
                count--;
                continue;
            }
            if (a[i] != 1 && map.getOrDefault(a[i], 0) > 0) {
                count--;
                continue;
            }
            
            Set<Integer> div = getDiv(a[i]);
            for (Integer d : div) {
                if (map.containsKey(d)) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }

    private static Set<Integer> getDiv(int i) {
        Set<Integer> res = new HashSet<>();
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                res.add(j);
                res.add(i / j);
            }
        }

        return res;
    }

}