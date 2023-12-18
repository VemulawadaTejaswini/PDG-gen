import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        List<List<Integer>> xLists = new ArrayList<>();
        List<List<Integer>> yLists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            List<Integer> x = new ArrayList<>();
            List<Integer> y = new ArrayList<>();
            for (int j = 0; j < a[i]; j++) {
                x.add(sc.nextInt());
                y.add(sc.nextInt());
            }
            xLists.add(x);
            yLists.add(y);
        }

        int ans = 0;
        for (int i = 0; i < (1 << n); i++) {
            Set<Integer> honests = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((1 & (i >> j)) == 1) {
                    honests.add(j + 1);
                }
            }
            boolean correct = true;
            for (int j = 0; j < n; j++) {
                List<Integer> xlist = xLists.get(j);
                List<Integer> ylist = yLists.get(j);
                boolean isHonest = honests.contains(j + 1);
                if (!isHonest) {
                    continue;
                }
                for (int k = 0; k < a[j]; k++) {
                    int x = xlist.get(k);
                    int y = ylist.get(k);
                    if (y == 0 && !honests.contains(x) || y == 1 && honests.contains(x)) {
                        continue;
                    }
                    correct = false;
                    break;
                }
                if (!correct) {
                    break;
                }
            }
            if (correct) {
                ans = Math.max(honests.size(), ans);
            }
        }
        System.out.println(ans);
    }

}
