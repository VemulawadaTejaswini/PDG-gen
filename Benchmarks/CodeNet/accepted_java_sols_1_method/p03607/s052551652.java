import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        // 出現した回数をカウントする
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(aArr[i])) {
                map.put(aArr[i], map.get(aArr[i]) + 1);
            } else {
                map.put(aArr[i], 1);
            }
        }

        int res = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 == 1) res++;
        }

        System.out.println(res);
    }
}
