import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> sLists = new ArrayList<>();
        int[] p = new int[m];

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                list.add(sc.nextInt());
            }
            sLists.add(list);
        }
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }

        int ans = 0;
        for (int bit = 0; bit < (1 << n); bit++) {
            Set<Integer> onOffPatter = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if ((1 & (bit >> i)) == 1) {
                    onOffPatter.add(i + 1);
                }
            }

            boolean allLights = true;
            for (int i = 0; i < m; i++) {
                List<Integer> sList = sLists.get(i);
                int count = 0;
                for (int s : sList) {
                    if (onOffPatter.contains(s)) {
                        count++;
                    }
                }
                if (count % 2 != p[i]) {
                    allLights = false;
                    break;
                }
            }
            if (allLights) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
